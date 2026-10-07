package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class va3 extends meh {
    public final Rect b;
    public final ahd c;
    public final /* synthetic */ ChatScreen d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va3(ChatScreen chatScreen, Context context) {
        super(context);
        this.d = chatScreen;
        this.b = new Rect();
        ahd ahdVar = new ahd(context, new ua3(chatScreen, 0));
        ahdVar.b = new n61(1, this, va3.class, "shouldSkipTap", "shouldSkipTap(Landroid/view/MotionEvent;)Z", 0, 12);
        ahdVar.c = new n61(1, this, va3.class, "onPreviewTap", "onPreviewTap(Landroid/view/MotionEvent;)V", 0, 13);
        this.c = ahdVar;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        Rect rect = this.b;
        if (view.getGlobalVisibleRect(rect)) {
            return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        return false;
    }

    @Override // defpackage.meh, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ahd ahdVar = this.c;
        ahdVar.a(motionEvent);
        if (ahdVar.b(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // defpackage.meh, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ahd ahdVar = this.c;
        ahdVar.a(motionEvent);
        if (ahdVar.b(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
}
