/*
 * Copyright 2014 Prateek Srivastava (@f2prateek)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.f2prateek.dfg.model;

import android.auto.value.AutoValue;
import android.os.Parcelable;

@AutoValue
public abstract class Bounds implements Parcelable {

  public abstract int x();

  public abstract int y();

  public static Bounds create(int x, int y) {
    return new AutoValue_Bounds(x, y);
  }
}
