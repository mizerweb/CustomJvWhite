package defpackage;

import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes4.dex */
public final class w72 extends AndroidRuntimeException {
    public w72() {
        super("Methods that affect the view hierarchy can can only be called from the main thread.");
    }

    public w72(String str) {
        super(str);
    }
}
