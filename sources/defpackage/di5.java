package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class di5 extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ei5 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public di5(ei5 ei5Var, int i) {
        this.c = i;
        int i2 = 4;
        switch (i) {
            case 1:
                this.d = ei5Var;
                super(i2, 2);
                break;
            case 2:
                this.d = ei5Var;
                super(i2, null);
                break;
            case 3:
            case 4:
            case 5:
            default:
                this.d = ei5Var;
                super(i2, Integer.MAX_VALUE);
                break;
            case 6:
                Boolean bool = Boolean.FALSE;
                this.d = ei5Var;
                super(i2, bool);
                break;
            case 7:
                Boolean bool2 = Boolean.FALSE;
                this.d = ei5Var;
                super(i2, bool2);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        InputFilter.LengthFilter[] lengthFilterArr;
        int i = this.c;
        a8g a8gVar = pq3.j;
        ei5 ei5Var = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    p1c p1cVar = ei5Var.j;
                    int maxCount = ei5Var.getMaxCount();
                    TextView textView = ei5Var.k;
                    if (maxCount != Integer.MAX_VALUE) {
                        textView.setMinimumWidth((int) textView.getPaint().measureText(String.valueOf(ei5Var.getMaxCount())));
                        lengthFilterArr = new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(ei5Var.getMaxCount())};
                    } else {
                        textView.setMinimumWidth(0);
                        lengthFilterArr = new InputFilter[0];
                    }
                    p1cVar.setFilters(lengthFilterArr);
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    ei5Var.j.setMinLines(iIntValue);
                }
                break;
            case 2:
                if (!cqk.d(obj, obj2)) {
                    ei5Var.onThemeChanged(a8gVar.h(ei5Var));
                }
                break;
            case 3:
                if (!cqk.d(obj, obj2)) {
                    ei5Var.onThemeChanged(a8gVar.h(ei5Var));
                }
                break;
            case 4:
                if (!cqk.d(obj, obj2)) {
                    ei5Var.onThemeChanged(a8gVar.h(ei5Var));
                }
                break;
            case 5:
                if (!cqk.d(obj, obj2)) {
                    ei5Var.onThemeChanged(a8gVar.h(ei5Var));
                }
                break;
            case 6:
                if (!cqk.d(obj, obj2)) {
                    ei5Var.onThemeChanged(a8gVar.h(ei5Var));
                }
                break;
            default:
                p1c p1cVar2 = ei5Var.j;
                if (!cqk.d(obj, obj2)) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    TextView textView2 = ei5Var.k;
                    if (!zBooleanValue) {
                        textView2.setVisibility(ei5Var.getMaxCount() == Integer.MAX_VALUE ? 4 : 0);
                        p1cVar2.setOnFocusChangeListener(null);
                    } else {
                        textView2.setVisibility(p1cVar2.isFocused() ? 0 : 4);
                        p1cVar2.setOnFocusChangeListener(new ci5(0, new ol0(13, ei5Var)));
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di5(Integer num, ei5 ei5Var, int i) {
        super(4, num);
        this.c = i;
        this.d = ei5Var;
    }
}
