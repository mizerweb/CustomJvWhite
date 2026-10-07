package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ct8 implements zpb {
    public final /* synthetic */ int a;

    public /* synthetic */ ct8(int i) {
        this.a = i;
    }

    @Override // defpackage.v76
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                aqb aqbVar = (aqb) obj2;
                aqbVar.a(rwd.g, entry.getKey());
                aqbVar.a(rwd.h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
