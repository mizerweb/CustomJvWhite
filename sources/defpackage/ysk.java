package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.text.Editable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ysk {
    public static final InputConfiguration a(String str, List list) {
        if (list.isEmpty()) {
            ore.k("Call to create InputConfiguration but list of InputConfigData is empty.");
            return null;
        }
        if (list.size() == 1) {
            rg8 rg8Var = (rg8) ww3.r1(list);
            return new InputConfiguration(rg8Var.a, rg8Var.b, rg8Var.c);
        }
        List<rg8> list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        for (rg8 rg8Var2 : list2) {
            hg.o();
            arrayList.add(hg.h(rg8Var2.a, rg8Var2.b, str));
        }
        return hg.g(((rg8) ww3.r1(list)).c, arrayList);
    }

    public static void b(Editable editable) {
        int i;
        int iU0;
        int length = editable.length() + 1;
        if (editable.nextSpanTransition(-1, length, y2e.class) < length) {
            ArrayList arrayList = new ArrayList(new wv(editable.getSpans(0, editable.length(), y2e.class), false));
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                y2e y2eVar = (y2e) arrayList.get(size);
                if (editable.getSpanStart(y2eVar) == editable.getSpanEnd(y2eVar)) {
                    editable.removeSpan(y2eVar);
                    arrayList.remove(size);
                }
            }
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                y2e y2eVar2 = (y2e) arrayList.get(i2);
                int spanStart = editable.getSpanStart(y2eVar2);
                int spanEnd = editable.getSpanEnd(y2eVar2);
                if (spanStart <= 0 || editable.charAt(spanStart - 1) == '\n') {
                    i = spanStart;
                } else {
                    int iY0 = r5h.Y0(editable, '\n', spanStart, 4);
                    i = iY0 == -1 ? 0 : iY0 + 1;
                }
                if (spanEnd < 0 || spanEnd >= editable.length() || editable.charAt(spanEnd) == '\n') {
                    iU0 = spanEnd;
                } else {
                    iU0 = r5h.U0(editable, '\n', spanEnd, 4);
                    if (iU0 == -1) {
                        iU0 = editable.length();
                    }
                }
                if (i <= iU0 && (spanStart != i || spanEnd != iU0)) {
                    editable.setSpan(y2eVar2, i, iU0, editable.getSpanFlags(y2eVar2));
                }
            }
            for (int size3 = arrayList.size() - 1; size3 > 0; size3--) {
                y2e y2eVar3 = (y2e) arrayList.get(size3);
                int spanStart2 = editable.getSpanStart(y2eVar3);
                int spanEnd2 = editable.getSpanEnd(y2eVar3);
                for (int i3 = size3 - 1; -1 < i3; i3--) {
                    y2e y2eVar4 = (y2e) arrayList.get(i3);
                    int spanStart3 = editable.getSpanStart(y2eVar4);
                    int spanEnd3 = editable.getSpanEnd(y2eVar4);
                    if (Math.max(spanStart2, spanStart3) <= Math.min(spanEnd2, spanEnd3)) {
                        int spanFlags = editable.getSpanFlags(y2eVar3);
                        editable.removeSpan(y2eVar4);
                        editable.setSpan(y2eVar3, Math.min(spanStart2, spanStart3), Math.max(spanEnd2, spanEnd3), spanFlags);
                        arrayList.remove(i3);
                        break;
                    }
                }
            }
        }
    }
}
