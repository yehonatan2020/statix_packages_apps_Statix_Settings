/*
 * Copyright (C) 2018 The Android Open Source Project
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
 *
 */
package com.statix.android.settings.fuelgauge.batterysaver;

import android.content.ContentResolver;
import android.content.Context;
import android.os.PowerManager;
import android.provider.Settings;
import android.provider.Settings.Global;

import androidx.annotation.VisibleForTesting;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

import com.android.settings.R;
import com.android.settings.Utils;
import com.android.settings.core.BasePreferenceController;

public class SmartPixelsPreferenceController extends BasePreferenceController {

    private static final String KEY_SMART_PIXELS = "smart_pixels";

    public SmartPixelsPreferenceController(Context context) {
        super(context, KEY_SMART_PIXELS);
    }

    @Override
    public String getPreferenceKey() {
        return KEY_SMART_PIXELS;
    }

    @Override
    public int getAvailabilityStatus() {
        final boolean enableSmartPixels =
                mContext.getResources().getBoolean(com.android.internal.R.bool.config_enableSmartPixels);
        return enableSmartPixels ? AVAILABLE : UNSUPPORTED_ON_DEVICE;
    }
}
