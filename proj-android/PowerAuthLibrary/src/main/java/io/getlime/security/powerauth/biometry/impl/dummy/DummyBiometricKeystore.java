/*
 * Copyright 2019 Wultra s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.getlime.security.powerauth.biometry.impl.dummy;

import android.support.annotation.Nullable;

import javax.crypto.SecretKey;

import io.getlime.security.powerauth.biometry.IBiometricKeystore;

/**
 * The {@code DummyBiometricKeystore} provides a dummy implementation for {@link IBiometricKeystore}
 * interface. The purpose of the class is to provide no keystore-related functions on devices
 * which doesn't have biometric device available or on devices with Android lesser than version 6.0.
 */
public class DummyBiometricKeystore implements IBiometricKeystore {
    @Override
    public boolean isKeystoreReady() {
        return false;
    }

    @Override
    public boolean containsDefaultKey() {
        return false;
    }

    @Nullable
    @Override
    public SecretKey generateDefaultKey() {
        return null;
    }

    @Override
    public boolean removeDefaultKey() {
        return false;
    }

    @Nullable
    @Override
    public SecretKey getDefaultKey() {
        return null;
    }
}
