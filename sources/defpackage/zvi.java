package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zvi implements sah {
    public static final Size g = new Size(1280, 720);
    public final String a;
    public final msh b;
    public final n4j c;
    public final Size d;
    public final fx5 e;
    public final Range f;

    public zvi(String str, msh mshVar, n4j n4jVar, Size size, fx5 fx5Var, Range range) {
        this.a = str;
        this.b = mshVar;
        this.c = n4jVar;
        this.d = size;
        this.e = fx5Var;
        this.f = range;
    }

    @Override // defpackage.sah
    public final Object get() {
        Integer num;
        LinkedHashMap linkedHashMap = qui.a;
        Range range = this.f;
        n4j n4jVar = this.c;
        kl2 kl2VarB = qui.b(n4jVar, range);
        StringBuilder sb = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i = kl2VarB.a;
        sb.append(i);
        sb.append("fps. Encode frame rate = ");
        int i2 = kl2VarB.b;
        sb.append(i2);
        sb.append("fps.");
        tvj.a("VidEncCfgDefaultRslvr", sb.toString());
        int iD = n4jVar.b;
        fx5 fx5Var = this.e;
        Size size = this.d;
        if (iD == 0) {
            tvj.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
            int i3 = fx5Var.b;
            int i4 = kl2VarB.b;
            int width = size.getWidth();
            Size size2 = g;
            iD = qui.d(14000000, i3, 8, i4, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight());
        }
        HashMap map = nx5.e;
        String str = this.a;
        Map map2 = (Map) map.get(str);
        int iIntValue = (map2 == null || (num = (Integer) map2.get(fx5Var)) == null) ? -1 : num.intValue();
        lj0 lj0VarA = qui.a(iIntValue, str);
        jj0 jj0VarD = kj0.d();
        jj0VarD.a = str;
        msh mshVar = this.b;
        if (mshVar == null) {
            ore.n("Null inputTimebase");
            return null;
        }
        jj0VarD.h = mshVar;
        if (size == null) {
            ore.n("Null resolution");
            return null;
        }
        jj0VarD.i = size;
        jj0VarD.g = Integer.valueOf(iD);
        jj0VarD.d = Integer.valueOf(i);
        jj0VarD.e = Integer.valueOf(i2);
        jj0VarD.b = Integer.valueOf(iIntValue);
        jj0VarD.j = lj0VarA;
        return jj0VarD.a();
    }
}
