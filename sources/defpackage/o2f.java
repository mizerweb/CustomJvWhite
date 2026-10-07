package defpackage;

import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import ru.ok.tamtam.messages.scheduled.SliderLayoutManager;
import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o2f extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ScheduledSendPickerBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2f(lq4 lq4Var, ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = scheduledSendPickerBottomSheet;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet = this.g;
        switch (i) {
            case 0:
                o2f o2fVar = new o2f(lq4Var, scheduledSendPickerBottomSheet, 0);
                o2fVar.f = obj;
                return o2fVar;
            case 1:
                o2f o2fVar2 = new o2f(lq4Var, scheduledSendPickerBottomSheet, 1);
                o2fVar2.f = obj;
                return o2fVar2;
            default:
                o2f o2fVar3 = new o2f(lq4Var, scheduledSendPickerBottomSheet, 2);
                o2fVar3.f = obj;
                return o2fVar3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((o2f) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((o2f) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((o2f) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        final int i = 0;
        final int i2 = 1;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                p2f p2fVar = (p2f) obj2;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "BottomSheetWidget", "new data " + p2fVar, null);
                    }
                }
                ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet = this.g;
                zv8[] zv8VarArr = ScheduledSendPickerBottomSheet.D;
                final g45 g45VarF1 = scheduledSendPickerBottomSheet.F1();
                List list = p2fVar.a;
                int i3 = p2fVar.d;
                g45VarF1.y = true;
                nee adapter = g45VarF1.s.getAdapter();
                m45 m45Var = adapter instanceof m45 ? (m45) adapter : null;
                if (m45Var != null) {
                    m45Var.I(list, new ai(g45VarF1, i3, 7));
                }
                List list2 = p2fVar.b;
                boolean z = p2fVar.g;
                final int i4 = p2fVar.e;
                if (z) {
                    i4 += 1073741808;
                }
                g45VarF1.z = true;
                nee adapter2 = g45VarF1.t.getAdapter();
                bsh bshVar = adapter2 instanceof bsh ? (bsh) adapter2 : null;
                if (bshVar != null) {
                    bshVar.G(list2, z, new af7() { // from class: c45
                        @Override // defpackage.af7
                        public final Object invoke() {
                            int i5 = i2;
                            sbi sbiVar = sbi.a;
                            int i6 = i4;
                            g45 g45Var = g45VarF1;
                            switch (i5) {
                                case 0:
                                    RecyclerView recyclerView = g45Var.u;
                                    ((SliderLayoutManager) recyclerView.getLayoutManager()).p1(i6, g45Var.B);
                                    recyclerView.post(new e45(g45Var, 1));
                                    break;
                                default:
                                    RecyclerView recyclerView2 = g45Var.t;
                                    ((SliderLayoutManager) recyclerView2.getLayoutManager()).p1(i6, g45Var.B);
                                    recyclerView2.post(new e45(g45Var, 0));
                                    break;
                            }
                            return sbiVar;
                        }
                    });
                }
                List list3 = p2fVar.c;
                boolean z2 = p2fVar.h;
                final int i5 = p2fVar.f;
                if (z2) {
                    i5 += 1073741820;
                }
                g45VarF1.A = true;
                nee adapter3 = g45VarF1.u.getAdapter();
                bsh bshVar2 = adapter3 instanceof bsh ? (bsh) adapter3 : null;
                if (bshVar2 != null) {
                    bshVar2.G(list3, z2, new af7() { // from class: c45
                        @Override // defpackage.af7
                        public final Object invoke() {
                            int i6 = i;
                            sbi sbiVar = sbi.a;
                            int i7 = i5;
                            g45 g45Var = g45VarF1;
                            switch (i6) {
                                case 0:
                                    RecyclerView recyclerView = g45Var.u;
                                    ((SliderLayoutManager) recyclerView.getLayoutManager()).p1(i7, g45Var.B);
                                    recyclerView.post(new e45(g45Var, 1));
                                    break;
                                default:
                                    RecyclerView recyclerView2 = g45Var.t;
                                    ((SliderLayoutManager) recyclerView2.getLayoutManager()).p1(i7, g45Var.B);
                                    recyclerView2.post(new e45(g45Var, 0));
                                    break;
                            }
                            return sbiVar;
                        }
                    });
                }
                break;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                x35 x35Var = (x35) obj3;
                ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet2 = this.g;
                zv8[] zv8VarArr2 = ScheduledSendPickerBottomSheet.D;
                vv vvVar = scheduledSendPickerBottomSheet2.x;
                zv8[] zv8VarArr3 = ScheduledSendPickerBottomSheet.D;
                zv8 zv8Var = zv8VarArr3[2];
                int i6 = m2f.$EnumSwitchMapping$0[((r2f) vvVar.a(scheduledSendPickerBottomSheet2)).ordinal()] == 1 ? R.string.scheduled_remind_button_text : R.string.scheduled_send_button_text;
                CharSequence charSequenceB = x35Var.a.f.b(scheduledSendPickerBottomSheet2.getContext());
                String str = "";
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                String string = charSequenceB.toString();
                ((cyb) scheduledSendPickerBottomSheet2.B.m(scheduledSendPickerBottomSheet2, zv8VarArr3[5])).setVisibility(0);
                cyb cybVar = (cyb) scheduledSendPickerBottomSheet2.B.m(scheduledSendPickerBottomSheet2, zv8VarArr3[5]);
                Resources resources = scheduledSendPickerBottomSheet2.getResources();
                if (resources != null) {
                    String string2 = resources.getString(i6, string.toLowerCase(Locale.ROOT), x35Var.b + ":" + x35Var.c);
                    if (string2 != null) {
                        str = string2;
                    }
                }
                cybVar.setText(str);
                break;
            default:
                Object obj4 = this.f;
                ch3.d0(obj);
                x35 x35Var2 = (x35) obj4;
                ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet3 = this.g;
                br4 targetController = scheduledSendPickerBottomSheet3.getTargetController();
                q2f q2fVar = targetController instanceof q2f ? (q2f) targetController : null;
                if (q2fVar != null) {
                    x35Var2.getClass();
                    Calendar calendar = Calendar.getInstance();
                    j45 j45Var = x35Var2.a;
                    calendar.set(1, j45Var.d);
                    calendar.set(2, j45Var.c);
                    calendar.set(5, j45Var.b);
                    calendar.set(11, x35Var2.b.a);
                    calendar.set(12, x35Var2.c.a);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    gm0.n("DateTime", calendar.getTime().toString());
                    long timeInMillis = calendar.getTimeInMillis();
                    vv vvVar2 = scheduledSendPickerBottomSheet3.v;
                    zv8 zv8Var2 = ScheduledSendPickerBottomSheet.D[0];
                    q2fVar.g(((Number) vvVar2.a(scheduledSendPickerBottomSheet3)).longValue(), timeInMillis);
                }
                ltb onBackPressedDispatcher = scheduledSendPickerBottomSheet3.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                break;
        }
        return sbi.a;
    }
}
