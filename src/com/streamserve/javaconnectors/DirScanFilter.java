package com.streamserve.javaconnectors;

import java.io.File;
import java.io.FilenameFilter;
/**
 * 
 * Helper class used by DirScan connectors for searching files which names match specific pattern
 *
 */

public class DirScanFilter implements FilenameFilter {

	static String m_pattern;

	public void setPattern(String pattern) {
		m_pattern = pattern;
	}

	/**
	 * Implements java.io.FilenameFilter.accept().
	 * 
	 * @param dir
	 *            the directory in which the file was found.
	 * @param fileName
	 *            the name of the file.
	 * @return true if and only if the name should be included in the file list,
	 *         false otherwise
	 */
	public boolean accept(File dir, String fileName) {
		return patternMatch(fileName, 0, 0);
	}

	/**
	 * Determines if a string matches a wild card pattern.
	 * 
	 * @param s
	 *            String, for example filename.txt
	 * @param p
	 *            Pattern, for example file*.t?t
	 * @param s_pos
	 *            must be zero
	 * @param p_pos
	 *            must be zero
	 * @return true when there is a match
	 */
	public static boolean patternMatch(String s, int s_pos, int p_pos) {

		for (; p_pos < m_pattern.length(); p_pos++, s_pos++) {
			if (m_pattern.charAt(p_pos) == '*') /* OK if *s == '\0' */
			{
				do {
					if (patternMatch(s, s_pos, p_pos + 1))
						return true;
				} while (s_pos++ < s.length());
				return false;
			}

			if (s_pos == s.length()) // too early
				return false;
			if (m_pattern.charAt(p_pos) == '?')
				continue;

			if (m_pattern.charAt(p_pos) == s.charAt(s_pos))
				continue;
			return false;
		}
		return s_pos == s.length() ? true : false;
	}

}
