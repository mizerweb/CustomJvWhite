package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sol {
    public static final boolean a(rt2 rt2Var, wo6 wo6Var) {
        if (rt2Var.y0()) {
            return ((Boolean) ((f5d) wo6Var).a.Z.a(e5d.S6[49]).i()).booleanValue();
        }
        return rt2Var.d0() || rt2Var.e0() || rt2Var.h0();
    }

    public static final t73 b(t3f t3fVar) {
        if (e(t3fVar)) {
            return t73.c;
        }
        if (d(t3fVar)) {
            return t73.d;
        }
        return cqk.d(t3fVar.a, "StoriesScreen") ? t73.e : t73.b;
    }

    public static final tnh c(rt2 rt2Var) {
        int i;
        if (rt2Var.y0()) {
            i = R.string.scheduled_reminders_send_later;
        } else {
            i = rt2Var.d0() ? R.string.scheduled_posts_send_later : R.string.scheduled_messages_send_later;
        }
        return new tnh(i);
    }

    public static final boolean d(t3f t3fVar) {
        return cqk.d(t3fVar.a, "PostCommentsChatScreen");
    }

    public static final boolean e(t3f t3fVar) {
        return cqk.d(t3fVar.a, "ScheduledChatScreen");
    }

    public static final List f(ktc ktcVar) throws IOException {
        Object next;
        List list = ktcVar.f;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Long) next).longValue() <= 0);
        if (next != null) {
            return list;
        }
        List<String> list2 = ktcVar.e;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        for (String str : list2) {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            Long lC0 = y5h.C0(sb.toString());
            arrayList.add(Long.valueOf(lC0 != null ? lC0.longValue() : 0L));
        }
        return arrayList;
    }

    public static final o6g g(final Widget widget, View view, tnh tnhVar, final yma ymaVar) {
        o6g o6gVar = new o6g(view.getContext(), pq3.j.e(view.getContext()).n(), Collections.singletonList(new n6g(R.id.send_context_menu_action_scheduled_send, tnhVar, null, Integer.valueOf(R.drawable.icon_clock), null)), new p7d(23, widget));
        o6gVar.setFocusable(false);
        o6gVar.c = true;
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        o6gVar.showAtLocation(view, 85, wk8.D(view.getContext()) - rect.right, zo5.b(8.0f, yl5.d().getDisplayMetrics().density, wk8.t(view.getContext()) - rect.top));
        p0m.a(view, mt7.LONG_PRESS);
        final vt3 vt3Var = new vt3(4, o6gVar);
        br4 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
        hve hveVarW1 = rootController != null ? rootController.w1() : null;
        if (hveVarW1 != null) {
            hveVarW1.a(vt3Var);
        }
        br4 parentController2 = widget;
        while (parentController2.getParentController() != null) {
            parentController2 = parentController2.getParentController();
        }
        RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
        hve hveVarU1 = rootController2 != null ? rootController2.u1() : null;
        if (hveVarU1 != null) {
            hveVarU1.a(vt3Var);
        }
        o6gVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: w1f
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                af7 af7Var = ymaVar;
                if (af7Var != null) {
                    af7Var.invoke();
                }
                br4 parentController3 = widget;
                br4 parentController4 = parentController3;
                while (parentController4.getParentController() != null) {
                    parentController4 = parentController4.getParentController();
                }
                RootController rootController3 = parentController4 instanceof RootController ? (RootController) parentController4 : null;
                hve hveVarW2 = rootController3 != null ? rootController3.w1() : null;
                vt3 vt3Var2 = vt3Var;
                if (hveVarW2 != null) {
                    hveVarW2.M(vt3Var2);
                }
                while (parentController3.getParentController() != null) {
                    parentController3 = parentController3.getParentController();
                }
                RootController rootController4 = parentController3 instanceof RootController ? (RootController) parentController3 : null;
                hve hveVarU2 = rootController4 != null ? rootController4.u1() : null;
                if (hveVarU2 != null) {
                    hveVarU2.M(vt3Var2);
                }
            }
        });
        return o6gVar;
    }
}
