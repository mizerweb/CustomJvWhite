package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class xkf extends mjf {
    public final Collection b;

    public xkf(Collection collection) {
        this.b = collection;
    }

    @Override // defpackage.mjf
    public final void B() {
        int i = 0;
        pw pwVar = new pw(0);
        Collection collection = this.b;
        if (collection == null || collection.contains(b81.d)) {
            pwVar.add(2);
        }
        if (collection == null || collection.contains(b81.c)) {
            pwVar.add(1);
            pwVar.add(4);
        }
        if (pwVar.isEmpty()) {
            return;
        }
        uoa uoaVarC = s().b.c();
        f4a f4aVar = new f4a(20);
        ose oseVar = (ose) uoaVarC;
        oseVar.getClass();
        try {
            oseVar.e().a(new wre(oseVar, pwVar, f4aVar, i));
        } catch (Throwable th) {
            gm0.V("RoomMessagesDatabase", "Can't update attach by type", new ase(th, null, 2, null));
        }
    }
}
