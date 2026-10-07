package ru.ok.android.externcalls.sdk;

import defpackage.bu1;
import defpackage.l4g;
import defpackage.m4g;
import defpackage.p4g;
import defpackage.q4g;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.yt1;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements SignalingProvider, m4g, rg4, StereoRoomManagerImpl.GrantRolesRequest {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(l4g l4gVar, p4g p4gVar) {
        ((ConversationImpl) this.b).handleSignalingError(l4gVar, p4gVar);
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) throws Throwable {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                ((ConversationImpl) obj2).lambda$addParticipant$32((Throwable) obj);
                break;
            default:
                ((sg4) obj2).accept((Throwable) obj);
                break;
        }
    }

    @Override // ru.ok.android.externcalls.sdk.signaling.SignalingProvider
    public q4g getSignaling() {
        return ((ConversationImpl) this.b).lambda$createSignalingProvider$42();
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.GrantRolesRequest
    public void grantRoles(yt1 yt1Var, boolean z, bu1[] bu1VarArr, Runnable runnable, Runnable runnable2) {
        ((ConversationImpl) this.b).grantRoles(yt1Var, z, bu1VarArr, runnable, runnable2);
    }
}
