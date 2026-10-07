package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class r60 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public /* synthetic */ r60(float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public float a() {
        return this.e;
    }

    public float b() {
        return this.b;
    }

    public float c() {
        return this.d;
    }

    public float d() {
        return this.c;
    }

    public HashMap e() {
        HashMap map = new HashMap();
        map.put("x1", Float.valueOf(this.b));
        map.put("y1", Float.valueOf(this.c));
        map.put("x2", Float.valueOf(this.d));
        map.put("y2", Float.valueOf(this.e));
        return map;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                float f = this.b;
                float f2 = this.c;
                float f3 = this.d;
                float f4 = this.e;
                StringBuilder sbN = bc1.n("{x1=", f, ", y1=", f2, ", x2=");
                sbN.append(f3);
                sbN.append(", y2=");
                sbN.append(f4);
                sbN.append("}");
                return sbN.toString();
            default:
                return super.toString();
        }
    }
}
