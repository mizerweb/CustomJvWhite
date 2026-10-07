package defpackage;

import androidx.media3.muxer.MuxerException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class da8 implements p9b {
    @Override // defpackage.p9b
    public final c98 a(int i) {
        if (i == 2) {
            return s2b.g;
        }
        if (i == 1) {
            return s2b.h;
        }
        a98 a98Var = c98.b;
        return ghe.e;
    }

    @Override // defpackage.p9b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ea8 c(String str) throws MuxerException {
        try {
            return new ea8(new s2b(new yr6(new FileOutputStream(str))));
        } catch (FileNotFoundException e) {
            throw new MuxerException("Error creating file output stream", e);
        }
    }
}
