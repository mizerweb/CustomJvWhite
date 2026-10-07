package defpackage;

import java.util.Objects;
import one.video.calls.sdk_private.bJ;

/* JADX INFO: loaded from: classes3.dex */
public final class h8k extends n86 {
    @Override // defpackage.obk
    public final void c(pbk pbkVar, c4h c4hVar) throws bJ {
        if (!(pbkVar instanceof qbk) && !(pbkVar instanceof sbk) && pbkVar.c.isEmpty()) {
            Objects.toString(pbkVar);
            throw new bJ(11, "packet must contain at least one frame");
        }
        if (pbkVar instanceof mbk) {
            mbk mbkVar = (mbk) pbkVar;
            if (!mbkVar.c.stream().allMatch(new e05(22))) {
                Objects.toString(mbkVar);
                throw new bJ(11, "packet contains frame type that is not permitted");
            }
        } else if (pbkVar instanceof kbk) {
            kbk kbkVar = (kbk) pbkVar;
            if (!kbkVar.c.stream().allMatch(new e05(23))) {
                Objects.toString(kbkVar);
                throw new bJ(11, "packet contains frame type that is not permitted");
            }
        } else if (pbkVar instanceof tbk) {
            tbk tbkVar = (tbk) pbkVar;
            if (tbkVar.c.stream().anyMatch(new e05(24))) {
                Objects.toString(tbkVar);
                throw new bJ(11, "packet contains frame type that is not permitted");
            }
        }
        l(pbkVar, c4hVar);
    }
}
