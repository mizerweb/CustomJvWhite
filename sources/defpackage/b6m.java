package defpackage;

import android.content.Context;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b6m implements f5m {
    public final oy8 a;
    public final x4m b;

    public b6m(Context context, x4m x4mVar) {
        this.b = x4mVar;
        g71 g71Var = g71.e;
        g4i.b(context);
        e4i e4iVarC = g4i.a().c(g71Var);
        if (g71.d.contains(new z86("json"))) {
            new oy8(new ftl(e4iVarC, 2));
        }
        this.a = new oy8(new ftl(e4iVarC, 3));
    }

    @Override // defpackage.f5m
    public final void a(wze wzeVar) {
        x4m x4mVar = this.b;
        x4mVar.getClass();
        f4i f4iVar = (f4i) this.a.get();
        x4mVar.getClass();
        er3 er3Var = er3.n;
        yfj yfjVar = (yfj) wzeVar.b;
        ((o73) wzeVar.c).i = false;
        o73 o73Var = (o73) wzeVar.c;
        o73Var.g = Boolean.FALSE;
        yfjVar.a = new x2m(o73Var);
        try {
            l6m.u();
            gul gulVar = new gul(yfjVar);
            r6a r6aVar = new r6a(1);
            er3Var.e(r6aVar);
            HashMap map = new HashMap((HashMap) r6aVar.a);
            HashMap map2 = new HashMap((HashMap) r6aVar.b);
            fok fokVar = (fok) r6aVar.c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                crk crkVar = new crk(byteArrayOutputStream, map, map2, fokVar);
                zpb zpbVar = (zpb) map.get(gul.class);
                if (zpbVar == null) {
                    throw new EncodingException("No encoder for ".concat(String.valueOf(gul.class)));
                }
                zpbVar.a(gulVar, crkVar);
                f4iVar.a(new jh0(byteArrayOutputStream.toByteArray(), vhd.b, null));
            } catch (IOException unused) {
            }
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
