package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class idc implements af7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ idc(ldc ldcVar, long j, long j2, tsh tshVar, iy9 iy9Var) {
        this.d = ldcVar;
        this.b = j;
        this.c = j2;
        this.e = tshVar;
        this.f = iy9Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                tsh tshVar = (tsh) obj2;
                iy9 iy9Var = (iy9) obj;
                bg6 bg6Var = ((ldc) obj3).V;
                boolean zF0 = bg6Var.f0();
                boolean zE0 = bg6Var.e0();
                long jV = bg6Var.V();
                long duration = bg6Var.getDuration();
                long j = tshVar.e;
                long jG = vqi.G(tshVar.f);
                long j2 = iy9Var.b;
                long j3 = iy9Var.a;
                long j4 = iy9Var.c;
                float f = iy9Var.d;
                float f2 = iy9Var.e;
                StringBuilder sbB = zo5.B("seekToLiveEdge() - live= ", zF0, " dyn= ", zE0, " curLiveOffset= ");
                sbB.append(jV);
                qt4.z(this.b, " wDef= ", " ppos= ", sbB);
                sbB.append(this.c);
                qt4.z(duration, " dur= ", " window={ start= ", sbB);
                sbB.append(j);
                qt4.z(jG, " cur= ", " } lc={ min= ", sbB);
                sbB.append(j2);
                qt4.z(j3, " target= ", " max= ", sbB);
                sbB.append(j4);
                sbB.append(" minSpd= ");
                sbB.append(f);
                sbB.append(" maxSpd= ");
                sbB.append(f2);
                sbB.append(" }");
                return sbB.toString();
            default:
                ose oseVar = (ose) obj3;
                gda gdaVar = (gda) obj2;
                Long l = (Long) obj;
                if (l == null || l.longValue() < 0) {
                    l = null;
                }
                return Long.valueOf(ose.i(oseVar, this.b, gdaVar, this.c, l, false, 48));
        }
    }

    public /* synthetic */ idc(ose oseVar, long j, gda gdaVar, long j2, Long l) {
        this.d = oseVar;
        this.b = j;
        this.e = gdaVar;
        this.c = j2;
        this.f = l;
    }
}
