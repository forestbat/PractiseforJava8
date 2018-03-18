class Parcel4 {
    interface Contents{
           public int i=11;
            public int value();}
        interface Destination{
            //! public String;
            String readLabel();
        }
    }
    class Parcel5 {
        private class Pcontents implements Parcel4.Contents {
            private int i = 11;

            public int value() {
                return i;
            }
        }

        protected class PDestination implements Parcel4.Destination {
            private String label;

            private PDestination(String Whereto) {
                label = Whereto;
            }

            public String readLabel() {
                return label;
            }
        }

        public Parcel4.Destination destination(String s) {
            return new PDestination(s);
        }

        public Parcel4.Contents contents() {
            return new Pcontents();
        }

    //public class TestParcel{
    public static void main(String...args){
        //TODO
    }
    }
