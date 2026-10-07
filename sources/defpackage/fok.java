package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fok implements zpb {
    public static final /* synthetic */ fok b = new fok(0);
    public static final /* synthetic */ fok c = new fok(1);
    public final /* synthetic */ int a;

    public /* synthetic */ fok(int i) {
        this.a = i;
    }

    @Override // defpackage.v76
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                aqb aqbVar = (aqb) obj2;
                aqbVar.a(iok.g, entry.getKey());
                aqbVar.a(iok.h, entry.getValue());
                return;
            case 1:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                aqb aqbVar2 = (aqb) obj2;
                aqbVar2.a(crk.g, entry2.getKey());
                aqbVar2.a(crk.h, entry2.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
