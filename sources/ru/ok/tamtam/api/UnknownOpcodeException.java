package ru.ok.tamtam.api;

import defpackage.c0a;
import defpackage.kfc;
import defpackage.lhb;
import defpackage.yhh;
import kotlin.Metadata;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ok/tamtam/api/UnknownOpcodeException;", "Lru/ok/tamtam/errors/TamErrorException;", "tamtam-java-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UnknownOpcodeException extends TamErrorException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnknownOpcodeException(short s) {
        super(new yhh("unknown.opcode", c0a.o("Unknown opcode ", lhb.c(s), "!"), null));
        kfc.c.getClass();
    }
}
