package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class nwa {
    public final kzi a;
    public final r6a b;
    public final HashMap c;

    public nwa(Context context, r6a r6aVar) {
        kzi kziVar = new kzi(context, 22);
        this.c = new HashMap();
        this.a = kziVar;
        this.b = r6aVar;
    }

    public final synchronized c4i a(String str) {
        if (this.c.containsKey(str)) {
            return (c4i) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryQ = this.a.q(str);
        if (cctBackendFactoryQ == null) {
            return null;
        }
        r6a r6aVar = this.b;
        c4i c4iVarCreate = cctBackendFactoryQ.create(new ch0((Context) r6aVar.c, (pt3) r6aVar.a, (pt3) r6aVar.b, str));
        this.c.put(str, c4iVarCreate);
        return c4iVarCreate;
    }
}
