package defpackage;

import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public final class nsf extends f83 {
    @Override // defpackage.f83
    public final String toString() {
        BitSet bitSet = (BitSet) this.b;
        boolean z = bitSet.get(0);
        boolean z2 = bitSet.get(1);
        boolean z3 = bitSet.get(8);
        boolean z4 = bitSet.get(2);
        boolean z5 = bitSet.get(3);
        boolean z6 = bitSet.get(4);
        boolean z7 = bitSet.get(5);
        boolean z8 = bitSet.get(6);
        boolean z9 = bitSet.get(7);
        StringBuilder sbB = zo5.B("\n            Payload(\n                isSectionChanged=", z, ",\n                isTitleChanged=", z2, ",\n                isTitleBadgeChanged=");
        qt4.B(",\n                isTypeChanged=", ",\n                isDescriptionResChanged=", sbB, z3, z4);
        qt4.B(",\n                isEndViewChanged=", ",\n                isCounterTypeChanged=", sbB, z5, z6);
        qt4.B(",\n                isUpperTextChanged=", ",\n                isStartIconChanged=", sbB, z7, z8);
        sbB.append(z9);
        sbB.append(",\n            )\n        ");
        return s5h.x0(sbB.toString());
    }
}
