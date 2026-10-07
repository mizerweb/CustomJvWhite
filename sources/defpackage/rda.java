package defpackage;

import android.graphics.drawable.Animatable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.io.IOException;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.sdk.database.DbCorruptionException;
import one.me.sdk.messagewrite.MessageWriteWidget;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class rda implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rda(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        defpackage.tvj.d("SequentialExecutor", "Exception while executing runnable " + r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.b     // Catch: java.lang.Throwable -> L4f
            eif r2 = (defpackage.eif) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r2 = r2.a     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.b     // Catch: java.lang.Throwable -> L20
            eif r0 = (defpackage.eif) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.d     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L44
        L20:
            r10 = move-exception
            goto L69
        L22:
            long r6 = r0.e     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.e = r6     // Catch: java.lang.Throwable -> L20
            r0.d = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.b     // Catch: java.lang.Throwable -> L20
            eif r4 = (defpackage.eif) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L45
            java.lang.Object r10 = r10.b     // Catch: java.lang.Throwable -> L20
            eif r10 = (defpackage.eif) r10     // Catch: java.lang.Throwable -> L20
            r10.d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
            goto L18
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            goto L2
        L4f:
            r10 = move-exception
            goto L6b
        L51:
            r2 = move-exception
            java.lang.String r3 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            defpackage.tvj.d(r3, r4, r2)     // Catch: java.lang.Throwable -> L4f
            goto L2
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L4f
        L6b:
            if (r1 == 0) goto L74
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L74:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rda.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() throws DbCorruptionException {
        Animatable animationDrawable;
        m8 m8Var;
        switch (this.a) {
            case 0:
                tda tdaVar = (tda) this.b;
                tdaVar.c().setPivotX(0.0f);
                tdaVar.c().setPivotY(0.0f);
                tdaVar.c().animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(150L).setInterpolator(new DecelerateInterpolator(1.2f)).start();
                return;
            case 1:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.b;
                zv8[] zv8VarArr = MessageContextMenuBottomSheet.w1;
                messageContextMenuBottomSheet.G1().setTranslationY(messageContextMenuBottomSheet.G1().getHeight());
                return;
            case 2:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) this.b;
                if (messageWriteWidget.getView() != null) {
                    zv8[] zv8VarArr2 = MessageWriteWidget.I;
                    messageWriteWidget.t1().requestFocus();
                    return;
                }
                return;
            case 3:
                View view = ((MessagesSettingsScreen) this.b).n;
                if (view != null) {
                    view.setClickable(true);
                    return;
                }
                return;
            case 4:
                nub nubVar = (nub) this.b;
                nub.i(nubVar);
                nubVar.j(true);
                return;
            case 5:
                throw new DbCorruptionException("fatal exception", (DbCorruptionException) this.b);
            case 6:
                p1c p1cVar = (p1c) this.b;
                p1cVar.setSelection(p1cVar.length());
                return;
            case 7:
                ((ubc) this.b).c();
                return;
            case 8:
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                if (profileScreen.getView() != null) {
                    whc whcVar = profileScreen.A;
                    if (whcVar != null) {
                        whcVar.f = -1;
                    }
                    if (whcVar != null) {
                        whcVar.h = -1;
                    }
                    if (whcVar != null) {
                        whcVar.b(profileScreen.u1(), 0, 0);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((b7e) this.b).f(true);
                return;
            case 10:
                wue wueVar = (wue) this.b;
                if (wueVar.y && (animationDrawable = wueVar.getAnimationDrawable()) != null) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                    wueVar.z.postDelayed(this, 5000L);
                    return;
                }
                return;
            case 11:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.b;
                if (searchView$SearchAutoComplete.f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f = false;
                    return;
                }
                return;
            case 12:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (((eif) this.b).a) {
                        ((eif) this.b).d = 1;
                        throw e;
                    }
                }
            case 13:
                mbg mbgVar = (mbg) this.b;
                if (mbgVar.i) {
                    mbgVar.j += 0.1f;
                    mbgVar.invalidateSelf();
                    mbgVar.scheduleSelf(mbgVar.h, SystemClock.uptimeMillis() + 3);
                    return;
                }
                return;
            case 14:
                ((StaggeredGridLayoutManager) this.b).M0();
                return;
            case 15:
                ((rjh) this.b).a.trySetResult(null);
                return;
            case 16:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (m8Var = actionMenuView.t) == null) {
                    return;
                }
                m8Var.l();
                return;
            case 17:
                ((er4) this.b).a();
                return;
            case 18:
                b9i b9iVar = (b9i) this.b;
                jac secondTextInputView = b9iVar.getSecondTextInputView();
                ViewGroup.LayoutParams layoutParams = secondTextInputView.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = zo5.b(48.0f, yl5.d().getDisplayMetrics().density, b9iVar.f.getInputHeight());
                secondTextInputView.setLayoutParams(marginLayoutParams);
                return;
            case 19:
                nl9.d(((jac) this.b).b, true);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((j7j) this.b).n(0);
                return;
            case 21:
                sb9 sb9Var = (sb9) ((xde) this.b).e;
                try {
                    sb9Var.g.execute(new myj(5, this));
                    return;
                } catch (Throwable th) {
                    sb9Var.n.logException("OKRTCLmsAdapter", "Unexpected executor usage error", th);
                    return;
                }
            case 22:
                Object socketLock = ((y5g) this.b).getSocketLock();
                y5g y5gVar = (y5g) this.b;
                synchronized (socketLock) {
                    g5g signalingLogger = y5gVar.getSignalingLogger();
                    signalingLogger.a.log(signalingLogger.d, "transport.DISCONNECT");
                    y5gVar.safelyCloseSocketWithCodeAndReason(1001, "dispose");
                }
                return;
            case 23:
                ((skk) this.b).e();
                return;
            case 24:
                fo foVar = ((skk) ((rai) this.b).a).d;
                foVar.a(foVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 25:
                ((dlk) this.b).j.f(new le4(4, null, null));
                return;
            case 26:
                vbj vbjVar = (vbj) this.b;
                synchronized (vbjVar.a) {
                    try {
                        if (vbjVar.b()) {
                            Log.e("WakeLock", String.valueOf(vbjVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            vbjVar.d();
                            if (vbjVar.b()) {
                                vbjVar.c = 1;
                                vbjVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 27:
                if (((qjh) this.b).c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            default:
                synchronized (((ecl) this.b).c) {
                    ((ntb) ((ecl) this.b).d).c();
                    break;
                }
                return;
        }
    }

    public /* synthetic */ rda(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
