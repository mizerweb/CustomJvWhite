package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.security.KeyStoreException;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.interfaces.XECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.NamedParameterSpec;
import java.security.spec.XECPublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class jx5 {
    public static /* synthetic */ void C() {
    }

    public static /* bridge */ /* synthetic */ DynamicRangeProfiles i(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    public static /* bridge */ /* synthetic */ XECPublicKey p(PublicKey publicKey) {
        return (XECPublicKey) publicKey;
    }

    public static /* synthetic */ NamedParameterSpec q(String str) {
        return new NamedParameterSpec(str);
    }

    public static /* synthetic */ XECPublicKeySpec r(AlgorithmParameterSpec algorithmParameterSpec, BigInteger bigInteger) {
        return new XECPublicKeySpec(algorithmParameterSpec, bigInteger);
    }

    public static /* synthetic */ void t() {
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof XECPublicKey;
    }

    public static /* bridge */ /* synthetic */ boolean y(Throwable th) {
        return th instanceof KeyStoreException;
    }
}
