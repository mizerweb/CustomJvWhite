package defpackage;

import one.me.startconversation.chat.PickChatMembers;

/* JADX INFO: loaded from: classes3.dex */
public final class hwc extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public /* synthetic */ Object f;
    public final /* synthetic */ PickChatMembers g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwc(lq4 lq4Var, PickChatMembers pickChatMembers) {
        super(2, lq4Var);
        this.g = pickChatMembers;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PickChatMembers pickChatMembers = this.g;
        switch (i) {
            case 0:
                hwc hwcVar = new hwc(pickChatMembers, lq4Var);
                hwcVar.f = obj;
                return hwcVar;
            default:
                hwc hwcVar2 = new hwc(lq4Var, pickChatMembers);
                hwcVar2.f = obj;
                return hwcVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((hwc) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((hwc) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        PickChatMembers pickChatMembers = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                long[] jArrG0 = rx8.g0((m8b) obj2);
                vv vvVar = pickChatMembers.j;
                zv8 zv8Var = PickChatMembers.p[0];
                vvVar.b(pickChatMembers, jArrG0);
                break;
            default:
                ch3.d0(obj);
                if (((Boolean) obj2).booleanValue()) {
                    zv8[] zv8VarArr = PickChatMembers.p;
                    wsc.i((wsc) pickChatMembers.l.getValue(), new svj(pickChatMembers, 1));
                }
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwc(PickChatMembers pickChatMembers, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = pickChatMembers;
    }
}
