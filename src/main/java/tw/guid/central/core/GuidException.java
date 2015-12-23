/*
 *
 * Copyright 2015 Wei-Ming Wu
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package tw.guid.central.core;

/**
 * 
 * {@link GuidException} is designed to be thrown while any exception occurs
 * during GUID processes.
 *
 */
public class GuidException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  private final String status;

  private final String title;

  public GuidException(int status, String title) {
    this.status = String.valueOf(status);
    this.title = title;
  }

  public String getStatus() {
    return status;
  }

  public String getTitle() {
    return title;
  }

}
