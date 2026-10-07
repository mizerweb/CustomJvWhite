package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.Window;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.stories.publish.PublishStoryBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class x62 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public x62(gvh gvhVar) {
        this.a = 3;
        this.c = gvhVar;
        Context context = gvhVar.a.getContext();
        CharSequence charSequence = gvhVar.h;
        g8 g8Var = new g8();
        g8Var.e = np0.r;
        g8Var.g = np0.r;
        g8Var.l = null;
        g8Var.m = null;
        g8Var.n = false;
        g8Var.o = false;
        g8Var.p = 16;
        g8Var.i = context;
        g8Var.a = charSequence;
        this.b = g8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object value;
        switch (this.a) {
            case 0:
                CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = (CallWaitingRoomEventsWidget) this.b;
                callWaitingRoomEventsWidget.s1(((n62) ((q62) this.c)).e);
                o65.c(cs1.b.b(), ":call-opponents-list?arg_key_scope_id=".concat(callWaitingRoomEventsWidget.getA().a), null, null, 6);
                break;
            case 1:
                ForwardPickerScreen forwardPickerScreen = (ForwardPickerScreen) this.b;
                zv8[] zv8VarArr = ForwardPickerScreen.z;
                mjg mjgVar = ((u87) forwardPickerScreen.x1().d).v;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, Boolean.valueOf(!((Boolean) value).booleanValue())));
                ForwardPickerScreen.A1(forwardPickerScreen, (z2e) this.c, ((Boolean) ((u87) forwardPickerScreen.x1().d).v.getValue()).booleanValue() ? new tnh(R.string.oneme_forward_author_invisible) : new tnh(R.string.oneme_forward_author_visible), false);
                break;
            case 2:
                RecordExitBottomSheet recordExitBottomSheet = (RecordExitBottomSheet) this.b;
                zv8[] zv8VarArr2 = RecordExitBottomSheet.E;
                kde kdeVar = (kde) recordExitBottomSheet.x.getValue();
                int i = (int) ((fde) this.c).c.a;
                boolean zIsChecked = recordExitBottomSheet.F1().isChecked();
                kdeVar.getClass();
                if (i != R.id.call_screen_record_me_owner_exit_positive && i != R.id.call_screen_record_admin_skip_record) {
                    if (i == R.id.call_screen_record_me_owner_exit_negative) {
                        k42.a(kdeVar.g);
                    } else if (i == R.id.call_screen_record_admin_stop_record) {
                        Boolean boolValueOf = Boolean.valueOf(zIsChecked);
                        fde fdeVar = (fde) kdeVar.j.a.getValue();
                        if (fdeVar == null || !fdeVar.f) {
                            boolValueOf = null;
                        }
                        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
                        Boolean bool = kdeVar.d;
                        if (bool != null) {
                            ((ya1) ((da1) kdeVar.i.getValue())).q(bool.booleanValue());
                        }
                        h02 h02Var = kdeVar.e;
                        yab.i0(h02Var.b, null, 0, new g02(h02Var, zBooleanValue, null, 0), 3);
                    }
                }
                recordExitBottomSheet.v1(true);
                break;
            case 3:
                gvh gvhVar = (gvh) this.c;
                Window.Callback callback = gvhVar.k;
                if (callback != null && gvhVar.l) {
                    callback.onMenuItemSelected(0, (g8) this.b);
                    break;
                }
                break;
            case 4:
                uik uikVar = ((fvj) this.b).u;
                long j = ((hyd) this.c).a;
                PublishStoryBottomSheet publishStoryBottomSheet = (PublishStoryBottomSheet) uikVar.b;
                zv8[] zv8VarArr3 = PublishStoryBottomSheet.t;
                nyd nydVarE1 = publishStoryBottomSheet.E1();
                String str = nydVarE1.f;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.j(j, "onItemClick: id: "), null);
                    }
                }
                nydVarE1.D(j);
                break;
            default:
                try {
                    ((Context) this.b).startActivity((Intent) this.c);
                } catch (ActivityNotFoundException e) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
                break;
        }
    }

    public /* synthetic */ x62(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
