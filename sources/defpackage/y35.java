package defpackage;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public final class y35 implements Comparable, Serializable {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public int h;

    public y35(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.f = num6;
        this.g = num7;
        k(num, 1, 9999, "Year");
        k(this.b, 1, 12, "Month");
        k(this.c, 1, 31, "Day");
        k(this.d, 0, 23, "Hour");
        k(this.e, 0, 59, "Minute");
        k(this.f, 0, 59, "Second");
        k(this.g, 0, 999999999, "Nanosecond");
        Integer num8 = this.a;
        Integer num9 = this.b;
        Integer num10 = this.c;
        Object[] objArr = {num8, num9, num10};
        for (int i = 0; i < 3; i++) {
            if (objArr[i] == null) {
                return;
            }
        }
        if (num10.intValue() <= p(num8, num9).intValue()) {
            return;
        }
        StringBuilder sb = new StringBuilder("The day-of-the-month value '");
        sb.append(num10);
        Integer numP = p(num8, num9);
        sb.append("' exceeds the number of days in the month: ");
        sb.append(numP);
        throw new ji1(sb.toString(), 2);
    }

    public static void a(String str, Object obj, StringBuilder sb) {
        StringBuilder sbZ = zo5.z(str, ":");
        sbZ.append(String.valueOf(obj));
        sbZ.append(" ");
        sb.append(sbZ.toString());
    }

    public static void k(Integer num, int i, int i2, String str) {
        if (num != null) {
            if (num.intValue() < i || num.intValue() > i2) {
                throw new ji1(str + " is not in the range " + i + ".." + i2 + ". Value is:" + num, 2);
            }
        }
    }

    public static y35 n(long j, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTimeInMillis(j);
        return new y35(Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13)), Integer.valueOf(gregorianCalendar.get(14) * 1000000));
    }

    public static Integer p(Integer num, Integer num2) {
        if (num != null && num2 != null) {
            if (num2.intValue() == 1) {
                return 31;
            }
            if (num2.intValue() == 2) {
                return Integer.valueOf((num.intValue() % 100 != 0 ? num.intValue() % 4 != 0 : num.intValue() % HttpStatus.SC_BAD_REQUEST != 0) ? 28 : 29);
            }
            if (num2.intValue() == 3) {
                return 31;
            }
            if (num2.intValue() == 4) {
                return 30;
            }
            if (num2.intValue() == 5) {
                return 31;
            }
            if (num2.intValue() == 6) {
                return 30;
            }
            if (num2.intValue() == 7 || num2.intValue() == 8) {
                return 31;
            }
            if (num2.intValue() == 9) {
                return 30;
            }
            if (num2.intValue() == 10) {
                return 31;
            }
            if (num2.intValue() == 11) {
                return 30;
            }
            if (num2.intValue() == 12) {
                return 31;
            }
            c.e(qv1.j("Month is out of range 1..12:", num2));
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        y35 y35Var = (y35) obj;
        if (this == y35Var) {
            return 0;
        }
        y35Var.getClass();
        int iO = n1g.o(this.a, y35Var.a);
        if (iO != 0) {
            return iO;
        }
        int iO2 = n1g.o(this.b, y35Var.b);
        if (iO2 != 0) {
            return iO2;
        }
        int iO3 = n1g.o(this.c, y35Var.c);
        if (iO3 != 0) {
            return iO3;
        }
        int iO4 = n1g.o(this.d, y35Var.d);
        if (iO4 != 0) {
            return iO4;
        }
        int iO5 = n1g.o(this.e, y35Var.e);
        if (iO5 != 0) {
            return iO5;
        }
        int iO6 = n1g.o(this.f, y35Var.f);
        if (iO6 != 0) {
            return iO6;
        }
        int iO7 = n1g.o(this.g, y35Var.g);
        if (iO7 != 0) {
            return iO7;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        Boolean boolValueOf;
        if (this == obj) {
            boolValueOf = Boolean.TRUE;
        } else {
            boolValueOf = !y35.class.isInstance(obj) ? Boolean.FALSE : null;
        }
        if (boolValueOf == null) {
            y35 y35Var = (y35) obj;
            y35Var.getClass();
            Object[] objArrQ = q();
            Object[] objArrQ2 = y35Var.q();
            boolean z = false;
            int i = 0;
            while (true) {
                boolean zEquals = true;
                if (i >= 7) {
                    z = true;
                    break;
                }
                Object obj2 = objArrQ[i];
                Object obj3 = objArrQ2[i];
                if ((obj2 != null && obj2.getClass().isArray()) || (obj3 != null && obj3.getClass().isArray())) {
                    ore.p("This method does not currently support arrays.");
                    return false;
                }
                if (obj2 != null) {
                    zEquals = obj2.equals(obj3);
                } else if (obj3 != null) {
                    zEquals = false;
                }
                if (!zEquals) {
                    break;
                }
                i++;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        return boolValueOf.booleanValue();
    }

    public final String h() {
        if (u(1) && t(2, 3, 4, 5, 6, 7)) {
            return "YYYY";
        }
        if (u(1, 2) && t(3, 4, 5, 6, 7)) {
            return "YYYY-MM";
        }
        if (u(1, 2, 3) && t(4, 5, 6, 7)) {
            return "YYYY-MM-DD";
        }
        if (u(1, 2, 3, 4) && t(5, 6, 7)) {
            return "YYYY-MM-DD hh";
        }
        if (u(1, 2, 3, 4, 5) && t(6, 7)) {
            return "YYYY-MM-DD hh:mm";
        }
        if (u(1, 2, 3, 4, 5, 6) && t(7)) {
            return "YYYY-MM-DD hh:mm:ss";
        }
        if (u(1, 2, 3, 4, 5, 6, 7)) {
            return "YYYY-MM-DD hh:mm:ss.fffffffff";
        }
        if (t(1, 2, 3) && u(4, 5, 6, 7)) {
            return "hh:mm:ss.fffffffff";
        }
        if (t(1, 2, 3, 7) && u(4, 5, 6)) {
            return "hh:mm:ss";
        }
        if (t(1, 2, 3, 6, 7) && u(4, 5)) {
            return "hh:mm";
        }
        return null;
    }

    public final int hashCode() {
        if (this.h == 0) {
            Object[] objArrQ = q();
            int iH = 23;
            for (int i = 0; i < 7; i++) {
                iH = n1g.H(iH, objArrQ[i]);
            }
            this.h = iH;
        }
        return this.h;
    }

    public final int i() {
        int iIntValue = this.a.intValue();
        int iIntValue2 = this.b.intValue();
        int i = (iIntValue2 - 14) / 12;
        return (((((((iIntValue2 - 2) - (i * 12)) * 367) / 12) + ((((iIntValue + 4800) + i) * 1461) / 4)) - (((((iIntValue + 4900) + i) / 100) * 3) / 4)) + this.c.intValue()) - 32075;
    }

    public final void m() {
        if (!u(1, 2, 3)) {
            throw new ji1();
        }
    }

    public final long o(TimeZone timeZone) {
        Integer num = this.d;
        int iIntValue = num == null ? 0 : num.intValue();
        Integer num2 = this.e;
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        Integer num3 = this.f;
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        Integer num4 = this.g;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.set(1, this.a.intValue());
        gregorianCalendar.set(2, this.b.intValue() - 1);
        gregorianCalendar.set(5, this.c.intValue());
        gregorianCalendar.set(11, iIntValue);
        gregorianCalendar.set(12, iIntValue2);
        gregorianCalendar.set(13, iIntValue3);
        gregorianCalendar.set(14, iIntValue4 / 1000000);
        return gregorianCalendar.getTimeInMillis();
    }

    public final Object[] q() {
        return new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g};
    }

    public final y35 r() {
        m();
        m();
        return new y35(this.a, this.b, this.c, 0, 0, 0, 0);
    }

    public final y35 s(Integer num) {
        m();
        m();
        int iIntValue = num.intValue() + i() + 68569;
        int i = (iIntValue * 4) / 146097;
        int i2 = iIntValue - (((146097 * i) + 3) / 4);
        int i3 = ((i2 + 1) * y5g.CLOSE_SOCKET_CODE_TIMEOUT) / 1461001;
        int i4 = (i2 - ((i3 * 1461) / 4)) + 31;
        int i5 = (i4 * 80) / 2447;
        int i6 = i5 / 11;
        y35 y35Var = new y35(Integer.valueOf(((i - 49) * 100) + i3 + i6), Integer.valueOf((i5 + 2) - (i6 * 12)), Integer.valueOf(i4 - ((i5 * 2447) / 80)), null, null, null, null);
        return new y35(y35Var.a, y35Var.b, y35Var.c, this.d, this.e, this.f, this.g);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    public final boolean t(int... iArr) {
        boolean z = true;
        for (int i : iArr) {
            if (7 == i) {
                if (z && this.g == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (6 == i) {
                if (z && this.f == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (5 == i) {
                if (z && this.e == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (4 == i) {
                if (z && this.d == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (3 == i) {
                if (z && this.c == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (2 == i) {
                if (z && this.b == null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (1 == i) {
                if (z && this.a == null) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        return z;
    }

    public final String toString() {
        if (l2m.c(null)) {
            return null;
        }
        if (h() != null) {
            return new b45(h()).b(this);
        }
        StringBuilder sb = new StringBuilder();
        a("Y", this.a, sb);
        a("M", this.b, sb);
        a("D", this.c, sb);
        a("h", this.d, sb);
        a("m", this.e, sb);
        a("s", this.f, sb);
        a("f", this.g, sb);
        return sb.toString().trim();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014  */
    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    public final boolean u(int... iArr) {
        boolean z = true;
        for (int i : iArr) {
            if (7 == i) {
                if (!z || this.g == null) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (6 == i) {
                if (!z || this.f == null) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (5 == i) {
                if (!z || this.e == null) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (4 == i) {
                if (!z || this.d == null) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (3 == i) {
                if (!z || this.c == null) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (2 == i) {
                if (!z || this.b == null) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (1 == i) {
                if (!z || this.a == null) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        return z;
    }
}
