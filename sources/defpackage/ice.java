package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ice extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ jce f;
    public final /* synthetic */ long g;
    public final /* synthetic */ byte[] h;
    public final /* synthetic */ g4b i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ice(jce jceVar, long j, byte[] bArr, g4b g4bVar, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = jceVar;
        this.g = j;
        this.h = bArr;
        this.i = g4bVar;
        this.j = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new ice(this.f, this.g, this.h, this.i, this.j, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ice) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        hu4 hu4Var = hu4.a;
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            jce jceVar = this.f;
            String str = jceVar.B;
            long j = this.g;
            byte[] bArr = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    String strName = jceVar.c.name();
                    Integer num = bArr != null ? new Integer(bArr.length) : null;
                    StringBuilder sbB = nbh.B(j, "Send ", strName, " with dur:");
                    sbB.append(", wav_s:");
                    sbB.append(num);
                    a4cVar.c(je9Var, str, sbB.toString(), null);
                }
            }
            jce jceVar2 = this.f;
            fbe fbeVar = jceVar2.c;
            long j2 = this.g;
            byte[] bArr2 = this.h;
            g4b g4bVar = this.i;
            boolean z = this.j;
            this.e = 1;
            if (jce.B(jceVar2, fbeVar, j2, bArr2, g4bVar, z, this) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        jce jceVar3 = this.f;
        mjg mjgVar = jceVar3.r;
        cce cceVar = new cce(jceVar3.N(), 2);
        mjgVar.getClass();
        mjgVar.j(null, cceVar);
        return sbi.a;
    }
}
