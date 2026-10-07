package defpackage;

import one.me.polls.screens.result.PollResultScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g9d implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PollResultScreen b;

    public /* synthetic */ g9d(PollResultScreen pollResultScreen, int i) {
        this.a = i;
        this.b = pollResultScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        PollResultScreen pollResultScreen = this.b;
        switch (i) {
            case 0:
                t9d t9dVar = (t9d) pollResultScreen.f.getAccessor().c(764);
                vv vvVar = pollResultScreen.c;
                zv8[] zv8VarArr = PollResultScreen.k;
                zv8 zv8Var = zv8VarArr[0];
                long jLongValue = ((Number) vvVar.a(pollResultScreen)).longValue();
                vv vvVar2 = pollResultScreen.d;
                zv8 zv8Var2 = zv8VarArr[1];
                long jLongValue2 = ((Number) vvVar2.a(pollResultScreen)).longValue();
                vv vvVar3 = pollResultScreen.e;
                zv8 zv8Var3 = zv8VarArr[2];
                long jLongValue3 = ((Number) vvVar3.a(pollResultScreen)).longValue();
                t9dVar.getClass();
                return new s9d(jLongValue, jLongValue2, jLongValue3, t9dVar.a, t9dVar.b, t9dVar.c, t9dVar.d, t9dVar.e, t9dVar.f, t9dVar.g, t9dVar.h);
            default:
                ((i8d) pollResultScreen.f.getAccessor().c(297)).getClass();
                return new h8d();
        }
    }
}
