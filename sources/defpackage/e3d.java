package defpackage;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;

/* JADX INFO: loaded from: classes2.dex */
public final class e3d implements rwi {
    public static final pah a = rx8.S(new d3d());

    @Override // defpackage.rwi
    public final twi a(Context context, p51 p51Var, ex3 ex3Var, boolean z, gj2 gj2Var) throws VideoFrameProcessingException {
        try {
            Class cls = (Class) a.get();
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            cls.getMethod("setEnableReplayableCache", Boolean.TYPE).invoke(objNewInstance, Boolean.FALSE);
            Object objInvoke = cls.getMethod("build", null).invoke(objNewInstance, null);
            objInvoke.getClass();
            return ((rwi) objInvoke).a(context, p51Var, ex3Var, z, gj2Var);
        } catch (Exception e) {
            throw new VideoFrameProcessingException(e);
        }
    }
}
