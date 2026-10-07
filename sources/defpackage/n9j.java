package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n9j {
    public static final Rect a = new Rect();
    public static final int[] b = new int[2];

    public static final void a(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver viewTreeObserver, View view) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        } else {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static final l9j b(ViewGroup viewGroup, af7 af7Var) {
        ViewGroup viewGroup2;
        ViewTreeObserver viewTreeObserver = viewGroup.getViewTreeObserver();
        m9j m9jVar = new m9j(af7Var, viewTreeObserver, viewGroup);
        viewTreeObserver.addOnGlobalLayoutListener(m9jVar);
        if (!viewGroup.isAttachedToWindow()) {
            viewGroup2 = viewGroup;
            if (!viewGroup2.isAttachedToWindow()) {
                viewGroup2.addOnAttachStateChangeListener(new k9j(viewGroup2, m9jVar, viewTreeObserver, viewGroup2, 0));
            } else if (viewGroup2.isAttachedToWindow()) {
                viewGroup2.addOnAttachStateChangeListener(new k9j(viewGroup2, m9jVar, viewTreeObserver, viewGroup2, 2));
            } else {
                a(m9jVar, viewTreeObserver, viewGroup2);
            }
        } else if (viewGroup.isAttachedToWindow()) {
            viewGroup2 = viewGroup;
            viewGroup2.addOnAttachStateChangeListener(new k9j(viewGroup2, m9jVar, viewTreeObserver, viewGroup, 1));
        } else {
            a(m9jVar, viewTreeObserver, viewGroup);
            viewGroup2 = viewGroup;
        }
        return new l9j(viewTreeObserver, viewGroup2, m9jVar);
    }

    public static final String c(View view) {
        String str;
        StringBuilder sb = new StringBuilder("\n");
        Resources resources = view.getResources();
        View rootView = view.getRootView();
        LinkedList linkedList = new LinkedList();
        linkedList.push(new ylc("", rootView));
        while (!linkedList.isEmpty()) {
            ylc ylcVar = (ylc) linkedList.pop();
            Object obj = ylcVar.b;
            Object obj2 = ylcVar.a;
            View view2 = (View) obj;
            boolean z = linkedList.isEmpty() || cqk.d(obj2, ((ylc) linkedList.peek()).a);
            String str2 = obj2 + (z ? "└── " : "├── ");
            String simpleName = view2.getClass().getSimpleName();
            int id = view2.getId();
            if (resources == null) {
                str = "";
            } else {
                try {
                    str = " / " + resources.getResourceEntryName(view2.getId());
                } catch (Throwable unused) {
                    str = "";
                }
            }
            sb.append(str2 + simpleName + " id=" + id + str + (view2.equals(view) ? " *********" : ""));
            sb.append("\n");
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    linkedList.push(new ylc(obj2 + (z ? "    " : "│   "), viewGroup.getChildAt(i)));
                }
            }
        }
        return sb.toString();
    }

    public static final Rect d(View view, View view2) {
        int left = view.getLeft();
        int top = view.getTop();
        Object parent = view.getParent();
        while (parent != view2 && (parent instanceof View)) {
            View view3 = (View) parent;
            int scrollX = left - view3.getScrollX();
            int scrollY = top - view3.getScrollY();
            left = scrollX + view3.getLeft();
            top = scrollY + view3.getTop();
            parent = view3.getParent();
        }
        int width = view.getWidth() + left;
        int height = view.getHeight() + top;
        Rect rect = a;
        rect.set(left, top, width, height);
        return rect;
    }

    public static final void e(Rect rect, View view) {
        int[] iArr = b;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }
}
