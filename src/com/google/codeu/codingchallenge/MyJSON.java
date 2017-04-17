// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.util.Collection;

final class MyJSON implements JSON {

  Map mapOfJSON = new Map<String, JSON>;

  @Override
  public JSON getObject(String name) {
    for(Map.entry(mapOfJSON) pair : map.EntrySet()) {
      if(pair.containsKey(name)) {
        return pair.get(name);
      }
    }
    return null;
  }

  @Override
  public JSON setObject(String name, JSON value) {
    for(Map.entry(mapOfJSON) pair : map.EntrySet()) {
      if(pair.containsKey(name)) {
        mapOfJSON.replace(name, value);
      }
    }
    return this;
  }

  @Override
  public String getString(String name) {
    for(Map.entry(mapOfJSON) pair : map.EntrySet()) {
      if(pair.containsKey(name)) {
        return pair.get(name);
      }
    }
    return null;
  }

  @Override
  public JSON setString(String name, String value) {
    for(Map.entry(mapOfJSON) pair : map.EntrySet()) {
      if(pair.containsKey(name)) {
        mapOfJSON.replace(name, value);
      }
    }
    return this;
  }

  @Override
  public void getObjects(Collection<String> names) {
    names.add(this.getObject());
  }

  @Override
  public void getStrings(Collection<String> names) {
    names.add(this.getString());
  }
}
