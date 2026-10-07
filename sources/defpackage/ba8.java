package defpackage;

import androidx.media3.muxer.MuxerException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ba8 implements p9b {
    @Override // defpackage.p9b
    public final c98 a(int i) {
        if (i == 2) {
            return tb7.d;
        }
        if (i == 1) {
            return tb7.e;
        }
        a98 a98Var = c98.b;
        return ghe.e;
    }

    @Override // defpackage.p9b
    public final q9b c(String str) throws MuxerException {
        try {
            return new ca8(new tb7(new FileOutputStream(str).getChannel(), 2000L));
        } catch (FileNotFoundException e) {
            throw new MuxerException("Error creating file output stream", e);
        }
    }
}
