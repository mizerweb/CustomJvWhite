package defpackage;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class d5b implements y78 {
    @Override // defpackage.y78
    public final x78 createImageTranscoder(i68 i68Var, boolean z) {
        x78 x78VarCreateImageTranscoder = null;
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            x78VarCreateImageTranscoder = ((y78) NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(Integer.valueOf(np0.q), Boolean.FALSE, Boolean.TRUE)).createImageTranscoder(i68Var, z);
        } catch (ClassNotFoundException e) {
            ore.h("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        } catch (IllegalAccessException e2) {
            ore.h("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
        } catch (IllegalArgumentException e3) {
            ore.h("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e3);
        } catch (InstantiationException e4) {
            ore.h("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e4);
        } catch (NoSuchMethodException e5) {
            ore.h("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e5);
        } catch (SecurityException e6) {
            ore.h("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e6);
        } catch (InvocationTargetException e7) {
            ore.h("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e7);
        }
        return x78VarCreateImageTranscoder == null ? new v6g(z) : x78VarCreateImageTranscoder;
    }
}
