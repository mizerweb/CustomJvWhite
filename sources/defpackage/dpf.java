package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dpf extends s7g {
    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        if (k79Var instanceof cbf) {
            cqf cqfVar = (cqf) this.a;
            cbf cbfVar = (cbf) k79Var;
            cqfVar.setCurrentLabelState(cbfVar.a);
            dbf dbfVar = cbfVar.b;
            dbf dbfVar2 = cbfVar.c;
            e8c e8cVar = cqfVar.d;
            e8cVar.setValueFrom(dbfVar.b);
            e8cVar.setValueTo(dbfVar2.b);
            cqfVar.a.setText(dbfVar.a.d(cqfVar));
            cqfVar.b.setText(dbfVar2.a.d(cqfVar));
        }
    }
}
