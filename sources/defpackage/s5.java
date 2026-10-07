package defpackage;

import scout.Component;

/* JADX INFO: loaded from: classes.dex */
public abstract class s5 extends Component {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(int i) {
        super(r7.d(ha9.b));
        switch (i) {
            case 2:
                r3f r3fVar = wk8.e;
                if (r3fVar != null) {
                    super(r3fVar);
                    return;
                } else {
                    ore.p("Root scope not initialized!");
                    throw null;
                }
            default:
                r7 r7Var = r7.a;
                return;
        }
    }
}
