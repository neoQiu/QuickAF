/*
 * Copyright (C) 2015-2016 QuickAF
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ieclipse.af.demo.sample.orm;

import android.os.Bundle;
import android.view.View;

import cn.ieclipse.af.demo.R;
import cn.ieclipse.af.demo.common.ui.BaseActivity;

/**
 * Description
 *
 * @author Jamling
 */
public class AormActivity extends BaseActivity {

    @Override
    protected int getContentLayout() {
        return R.layout.main_content;
    }

    @Override
    protected void initContentView(View view) {
        super.initContentView(view);
        setTitle("Android ORM");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null){
            AormFragment f = new AormFragment();
            pushFragments(f, true, false, f.getClass().getName());
        }
    }
}
