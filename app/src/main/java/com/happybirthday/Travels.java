package com.happybirthday;

import java.util.ArrayList;
import java.util.List;

/*
Copyright 2012 Aphid Mobile

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

 */
public class Travels {

  public static final List<Data> IMG_DESCRIPTIONS = new ArrayList<Data>();


  static {
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb1,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb2,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb2,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb3,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb4,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb5,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb6,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb7,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb8,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb9,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb10,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb11,"SATYA"));
    Travels.IMG_DESCRIPTIONS.add(new Data("SRINUKUMAR",R.drawable.img_hb12,"SATYA"));

  }

  public static final class Data {

    public final String title;
    public final int imageRes;
    public final String description;

    private Data(String title, int imageFilename, String description) {
      this.title = title;
      this.imageRes = imageFilename;
      this.description = description;

    }
  }
}
