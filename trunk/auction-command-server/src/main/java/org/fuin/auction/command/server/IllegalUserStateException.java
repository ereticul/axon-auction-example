/*
 * Copyright (c) 2010. Axon Auction Example
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fuin.auction.command.server;

import org.fuin.auction.common.UserState;


/**
 * The state of the user is not as expected.
 */
public class IllegalUserStateException extends Exception {

	private static final long serialVersionUID = -6902719704727052175L;

	/**
	 * Constructor with states.
	 * 
	 * @param currentState
	 *            Current state.
	 * @param expected
	 *            Expected states.
	 */
	public IllegalUserStateException(final UserState currentState, final UserState... expected) {
		super("The current state was " + currentState + ", but expected: " + createStr(expected));
	}

	private static String createStr(final UserState... states) {
		final StringBuffer sb = new StringBuffer();
		for (final UserState state : states) {
			if (sb.length() > 0) {
				sb.append(", ");
			}
			sb.append(state.name());
		}
		return sb.toString();
	}

}