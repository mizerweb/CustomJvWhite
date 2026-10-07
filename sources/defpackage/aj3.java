package defpackage;

import one.me.chats.search.ChatsListSearchScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class aj3 extends pee {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ aj3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pee
    public void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ((qq7) obj).e();
                break;
            case 3:
                ((fwg) obj).e();
                break;
        }
    }

    @Override // defpackage.pee
    public void b(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 1:
                ((qq7) obj).e();
                break;
            case 2:
                ((af7) obj).invoke();
                break;
            case 3:
                ((fwg) obj).e();
                break;
        }
    }

    @Override // defpackage.pee
    public void c(int i, int i2, Object obj) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 1:
                ((qq7) obj2).e();
                break;
            case 2:
                ((af7) obj2).invoke();
                break;
            case 3:
                ((fwg) obj2).e();
                break;
            default:
                super.c(i, i2, obj);
                break;
        }
    }

    @Override // defpackage.pee
    public final void d(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj;
                zv8[] zv8VarArr = ChatsListSearchScreen.F;
                if (((jj3) chatsListSearchScreen.r1().F.a.getValue()).d.size() == i2) {
                    chatsListSearchScreen.u1();
                }
                chatsListSearchScreen.v1(i2 > 0 && chatsListSearchScreen.r1().F());
                break;
            case 1:
                ((qq7) obj).e();
                break;
            case 2:
                ((af7) obj).invoke();
                break;
            default:
                ((fwg) obj).e();
                break;
        }
    }

    @Override // defpackage.pee
    public void e(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 1:
                ((qq7) obj).e();
                break;
            case 2:
                ((af7) obj).invoke();
                break;
            case 3:
                ((fwg) obj).e();
                break;
        }
    }

    @Override // defpackage.pee
    public final void f(int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) obj;
                zv8[] zv8VarArr = ChatsListSearchScreen.F;
                if (((jj3) chatsListSearchScreen.r1().F.a.getValue()).d.isEmpty()) {
                    chatsListSearchScreen.v1(false);
                }
                break;
            case 1:
                ((qq7) obj).e();
                break;
            case 2:
                ((af7) obj).invoke();
                break;
            default:
                ((fwg) obj).e();
                break;
        }
    }
}
