package ru.ok.tamtam.messages;

import defpackage.bi4;
import defpackage.e13;
import defpackage.eia;
import defpackage.fda;
import defpackage.gm0;
import defpackage.ny8;
import defpackage.sfa;
import defpackage.uia;
import defpackage.yw3;
import defpackage.zja;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public a(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    public static fda a(a aVar, sfa sfaVar) {
        aVar.getClass();
        if (sfaVar.a == 0) {
            gm0.V(a.class.getName(), "try to create message with zero local id", new MessageException.ZeroId());
        }
        sfa sfaVar2 = sfaVar.q;
        eia eiaVar = sfaVar2 != null ? new eia(sfaVar.o, sfaVar.p, a(aVar, sfaVar2), sfaVar.r, sfaVar.s, sfaVar.t, sfaVar.I, sfaVar.x, sfaVar.y) : null;
        sfa sfaVar3 = sfaVar.z;
        return new fda(sfaVar, ((bi4) aVar.a.getValue()).f(sfaVar.e, true), eiaVar, sfaVar3 != null ? a(aVar, sfaVar3) : null, ((b) aVar.b.getValue()).f(null, sfaVar), (uia) aVar.c.getValue(), (zja) aVar.d.getValue(), (e13) aVar.e.getValue());
    }

    public final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a(this, (sfa) it.next()));
        }
        return arrayList2;
    }
}
