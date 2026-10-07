package defpackage;

import java.util.Iterator;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import one.video.player.error.OneVideoPlaybackException;

/* JADX INFO: loaded from: classes3.dex */
public final class zni implements c3j {
    public final /* synthetic */ UserStoriesScreen a;

    public zni(UserStoriesScreen userStoriesScreen) {
        this.a = userStoriesScreen;
    }

    @Override // defpackage.c3j
    public final void a(int i) {
        Object next;
        UserStoriesScreen userStoriesScreen = this.a;
        zv8[] zv8VarArr = UserStoriesScreen.x1;
        gpi gpiVarH1 = userStoriesScreen.H1();
        je9 je9Var = je9.d;
        String str = gpiVarH1.p;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.h(i, "onVideoPlaylistItemEnded: playerItemIndex = "), null);
        }
        Iterator it = ((Iterable) gpiVarH1.A.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            lsg lsgVar = (lsg) next;
            jsg jsgVar = lsgVar instanceof jsg ? (jsg) lsgVar : null;
            if (jsgVar != null && jsgVar.c == i) {
                break;
            }
        }
        lsg lsgVar2 = (lsg) next;
        if (lsgVar2 == null) {
            String str2 = gpiVarH1.p;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                return;
            }
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, zo5.h(i, "onVideoPlaylistItemEnded: no item with player position = "), null);
                return;
            }
            return;
        }
        if (((Number) gpiVarH1.D.a.getValue()).intValue() == lsgVar2.f()) {
            gpiVarH1.M();
            return;
        }
        String str3 = gpiVarH1.p;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str3, "onVideoPlaylistItemEnded: items already changed", null);
        }
    }

    @Override // defpackage.c3j
    public final void d() {
        UserStoriesScreen userStoriesScreen = this.a;
        String str = userStoriesScreen.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("onDecodedFirstFrame: hasEverRendered=", userStoriesScreen.o), null);
            }
        }
        UserStoriesScreen userStoriesScreen2 = this.a;
        if (userStoriesScreen2.o) {
            userStoriesScreen2.H1().J();
        }
    }

    @Override // defpackage.c3j
    public final void e() {
        je9 je9Var = je9.d;
        UserStoriesScreen userStoriesScreen = this.a;
        String str = userStoriesScreen.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, zo5.s("onPlaybackStarted: view exists=", userStoriesScreen.getView() != null), null);
        }
        gpi gpiVarH1 = this.a.H1();
        boolean zBooleanValue = ((Boolean) gpiVarH1.v1.a.getValue()).booleanValue();
        String str2 = gpiVarH1.p;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, zo5.s("onVideoPlaybackStarted: wasReady=", zBooleanValue), null);
        }
        t3h t3hVar = gpiVarH1.l;
        lsg lsgVar = (lsg) gpiVarH1.F.a.getValue();
        Long lValueOf = lsgVar != null ? Long.valueOf(lsgVar.c()) : null;
        if (lValueOf != null) {
            azg azgVar = gpiVarH1.c;
            long jLongValue = lValueOf.longValue();
            t3hVar.getClass();
            t3h.z(t3hVar, azgVar, jLongValue, "story_shown", 4, null, 32);
        }
        mjg mjgVar = gpiVarH1.u1;
        Boolean bool = Boolean.TRUE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        if (zBooleanValue) {
            return;
        }
        gpiVarH1.J();
    }

    @Override // defpackage.c3j
    public final void g() {
        UserStoriesScreen userStoriesScreen = this.a;
        String str = userStoriesScreen.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.s("onRenderedFirstFrame: view exists=", userStoriesScreen.getView() != null), null);
            }
        }
        UserStoriesScreen userStoriesScreen2 = this.a;
        userStoriesScreen2.o = true;
        gpi gpiVarH1 = userStoriesScreen2.H1();
        t3h t3hVar = gpiVarH1.l;
        lsg lsgVar = (lsg) gpiVarH1.F.a.getValue();
        Long lValueOf = lsgVar != null ? Long.valueOf(lsgVar.c()) : null;
        if (lValueOf != null) {
            azg azgVar = gpiVarH1.c;
            long jLongValue = lValueOf.longValue();
            t3hVar.getClass();
            t3h.z(t3hVar, azgVar, jLongValue, "story_preview_shown", 3, null, 48);
        }
        mjg mjgVar = gpiVarH1.u1;
        Boolean bool = Boolean.TRUE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        gpiVarH1.J();
    }

    @Override // defpackage.c3j
    public final void o(Throwable th) {
        UserStoriesScreen userStoriesScreen = this.a;
        zv8[] zv8VarArr = UserStoriesScreen.x1;
        gpi gpiVarH1 = userStoriesScreen.H1();
        je9 je9Var = je9.d;
        gpiVarH1.l.A(gpiVarH1.c, m3h.VIDEO_LOAD_ERROR, th);
        if (!cec.e(th instanceof OneVideoPlaybackException ? (OneVideoPlaybackException) th : null)) {
            String str = gpiVarH1.p;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onVideoPlaybackError: not a network error, ignoring", null);
                return;
            }
            return;
        }
        lsg lsgVar = (lsg) gpiVarH1.F.a.getValue();
        Long lValueOf = lsgVar != null ? Long.valueOf(lsgVar.c()) : null;
        String str2 = gpiVarH1.p;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "onVideoPlaybackError: network error, waiting for connection restore for story=" + lValueOf, null);
        }
        gpiVarH1.Y.B(gpiVarH1, gpi.C1[0], yab.h0(gpiVarH1.b, ((n0c) gpiVarH1.f).a(), 2, new soi(gpiVarH1, lValueOf, null, 1)));
    }
}
