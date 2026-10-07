package one.video.calls.audio.opus;

import defpackage.qt4;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class OpusError extends IOException {
    public OpusError(int i, String str) {
        super(qt4.j(i, str, ": "));
    }
}
