package defpackage;

import org.msgpack.core.MessageFormatException;

/* JADX INFO: loaded from: classes.dex */
public enum uga {
    POSFIXINT(3),
    FIXMAP(8),
    FIXARRAY(7),
    FIXSTR(5),
    NIL(1),
    NEVER_USED(0),
    BOOLEAN(2),
    BIN8(6),
    BIN16(6),
    BIN32(6),
    EXT8(9),
    EXT16(9),
    EXT32(9),
    FLOAT32(4),
    FLOAT64(4),
    UINT8(3),
    UINT16(3),
    UINT32(3),
    UINT64(3),
    INT8(3),
    INT16(3),
    INT32(3),
    INT64(3),
    FIXEXT1(9),
    FIXEXT2(9),
    FIXEXT4(9),
    FIXEXT8(9),
    FIXEXT16(9),
    STR8(5),
    STR16(5),
    STR32(5),
    ARRAY16(7),
    ARRAY32(7),
    MAP16(8),
    MAP32(8),
    NEGFIXINT(3);

    public static final uga[] X = new uga[np0.n];
    public final int a;

    static {
        uga ugaVar;
        for (int i = 0; i <= 255; i++) {
            byte b = (byte) i;
            if ((b & (-128)) != 0) {
                int i2 = b & (-32);
                if (i2 == -32) {
                    ugaVar = NEGFIXINT;
                } else if (i2 != -96) {
                    int i3 = b & (-16);
                    if (i3 == -112) {
                        ugaVar = FIXARRAY;
                    } else if (i3 != -128) {
                        switch (b) {
                            case -64:
                                ugaVar = NIL;
                                break;
                            case -63:
                            default:
                                ugaVar = NEVER_USED;
                                break;
                            case -62:
                            case -61:
                                ugaVar = BOOLEAN;
                                break;
                            case -60:
                                ugaVar = BIN8;
                                break;
                            case -59:
                                ugaVar = BIN16;
                                break;
                            case -58:
                                ugaVar = BIN32;
                                break;
                            case -57:
                                ugaVar = EXT8;
                                break;
                            case -56:
                                ugaVar = EXT16;
                                break;
                            case -55:
                                ugaVar = EXT32;
                                break;
                            case -54:
                                ugaVar = FLOAT32;
                                break;
                            case -53:
                                ugaVar = FLOAT64;
                                break;
                            case -52:
                                ugaVar = UINT8;
                                break;
                            case -51:
                                ugaVar = UINT16;
                                break;
                            case -50:
                                ugaVar = UINT32;
                                break;
                            case -49:
                                ugaVar = UINT64;
                                break;
                            case -48:
                                ugaVar = INT8;
                                break;
                            case -47:
                                ugaVar = INT16;
                                break;
                            case -46:
                                ugaVar = INT32;
                                break;
                            case -45:
                                ugaVar = INT64;
                                break;
                            case -44:
                                ugaVar = FIXEXT1;
                                break;
                            case -43:
                                ugaVar = FIXEXT2;
                                break;
                            case -42:
                                ugaVar = FIXEXT4;
                                break;
                            case -41:
                                ugaVar = FIXEXT8;
                                break;
                            case -40:
                                ugaVar = FIXEXT16;
                                break;
                            case -39:
                                ugaVar = STR8;
                                break;
                            case -38:
                                ugaVar = STR16;
                                break;
                            case -37:
                                ugaVar = STR32;
                                break;
                            case -36:
                                ugaVar = ARRAY16;
                                break;
                            case -35:
                                ugaVar = ARRAY32;
                                break;
                            case -34:
                                ugaVar = MAP16;
                                break;
                            case -33:
                                ugaVar = MAP32;
                                break;
                        }
                    } else {
                        ugaVar = FIXMAP;
                    }
                } else {
                    ugaVar = FIXSTR;
                }
            } else {
                ugaVar = POSFIXINT;
            }
            X[i] = ugaVar;
        }
    }

    uga(int i) {
        this.a = i;
    }

    public final int a() {
        if (this != NEVER_USED) {
            return this.a;
        }
        throw new MessageFormatException("Cannot convert NEVER_USED to ValueType");
    }
}
