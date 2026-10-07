package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oia {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public oia(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(long j, nq4 nq4Var) {
        nia niaVar;
        sfa sfaVar;
        long j2 = j;
        if (nq4Var instanceof nia) {
            niaVar = (nia) nq4Var;
            int i = niaVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                niaVar.h = i - Integer.MIN_VALUE;
            } else {
                niaVar = new nia(this, nq4Var);
            }
        } else {
            niaVar = new nia(this, nq4Var);
        }
        Object objF = niaVar.f;
        int i2 = niaVar.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objF);
            sua suaVar = (sua) this.b.getValue();
            niaVar.d = j2;
            niaVar.h = 1;
            objF = suaVar.f(j2, niaVar);
            if (objF != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            j2 = niaVar.d;
            ch3.d0(objF);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sfaVar = niaVar.e;
            ch3.d0(objF);
        }
        i8e.d((i8e) this.a.getValue(), ((rt2) objF).A(), sfaVar.c, sfaVar.b, true, true, false, 64);
        return sbiVar;
        sfa sfaVar2 = (sfa) objF;
        if (sfaVar2 == null) {
            gm0.Y(oia.class.getName(), "Early return in execute cuz of messagesRepository.selectMessage(messageId) is null");
            return sbiVar;
        }
        jz jzVar = new jz(((xn3) this.c.getValue()).k(sfaVar2.h), 13);
        niaVar.e = sfaVar2;
        niaVar.d = j2;
        niaVar.h = 2;
        Object objN = e9i.N(jzVar, niaVar);
        if (objN != hu4Var) {
            objF = objN;
            sfaVar = sfaVar2;
            i8e.d((i8e) this.a.getValue(), ((rt2) objF).A(), sfaVar.c, sfaVar.b, true, true, false, 64);
            return sbiVar;
        }
        return hu4Var;
    }
}
