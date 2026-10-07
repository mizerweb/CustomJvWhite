package ru.ok.android.externcalls.sdk;

import defpackage.q4g;
import defpackage.sg4;
import defpackage.yt1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements sg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ h(Object obj, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.sg4
    public final void accept(Object obj) {
        int i = this.a;
        boolean z = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ConversationImpl) obj2).lambda$removeParticipant$33(z, (yt1) obj);
                break;
            case 1:
                ((ConversationImpl) obj2).lambda$promoteParticipant$34(z, (yt1) obj);
                break;
            default:
                ConversationImpl.lambda$setMuteState$41((q4g) obj2, z, (yt1) obj);
                break;
        }
    }
}
