package one.video.calls.sdk_private;

import defpackage.w4k;

/* JADX INFO: loaded from: classes3.dex */
public final class aP extends Exception {
    public final int a;

    public aP(w4k w4kVar, boolean z) {
        super("Missing keys for encryption level " + w4kVar + (z ? " (keys discarded)" : " (keys not installed)"));
        this.a = z ? 2 : 1;
    }
}
