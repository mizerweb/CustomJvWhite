package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r45 extends fg7 implements qf7 {
    public static final r45 a = new r45(2, s45.class, "merge", "merge(Lru/ok/tamtam/android/notifications/DebounceNotificationDispatcher$DispatchParams;)Lru/ok/tamtam/android/notifications/DebounceNotificationDispatcher$DispatchParams;", 0);

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        l8b l8bVar;
        s45 s45Var = (s45) obj;
        s45 s45Var2 = (s45) obj2;
        s45 s45Var3 = s45.g;
        if (s45Var2 == s45Var3) {
            return s45Var3;
        }
        if (s45Var == s45Var3 || s45Var2.f != null) {
            return s45Var2;
        }
        boolean z = true;
        if (!s45Var.a && !s45Var2.a) {
            z = false;
        }
        m8b m8bVarX = rx8.X(s45Var.b, s45Var2.b);
        m8b m8bVarX2 = rx8.X(s45Var.c, s45Var2.c);
        if (!s45Var.d && !s45Var2.d) {
            z = false;
        }
        l8b l8bVar2 = s45Var.e;
        l8b l8bVar3 = s45Var2.e;
        if (l8bVar3.h()) {
            l8bVar = l8bVar2;
        } else if (l8bVar2.h()) {
            l8bVar = l8bVar3;
        } else {
            l8b l8bVar4 = new l8b(l8bVar2.e + l8bVar3.e);
            l8bVar4.j(l8bVar2);
            l8bVar4.j(l8bVar3);
            l8bVar = l8bVar4;
        }
        return new s45(z, m8bVarX, m8bVarX2, z, l8bVar, null, 32);
    }
}
