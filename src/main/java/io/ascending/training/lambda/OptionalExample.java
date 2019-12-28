package io.ascending.training.lambda;

import java.util.Optional;

public class OptionalExample {
    public class Computer {
        private Optional<Soundcard> soundcard;
        public Optional<Soundcard> getSoundcard() {
            return this.soundcard;
        }

        public void setSoundcard(Optional<Soundcard> soundcard) {
            this.soundcard = soundcard;
        }
    }

    public class Soundcard {
        private Optional<USB> usb;
        public Optional<USB> getUSB() {
            return this.usb;
        };

        public void setUsb(Optional<USB> usb) {
            this.usb = usb;
        }
    }
    public class USB{
        public USB(String version) {
            this.version = version;
        }

        private String version;
        public String getVersion(){ return version;  }
    }

    public static void main(String[] args){
        OptionalExample example = new OptionalExample();
        USB usb = example.new USB("1.1");

        Soundcard sc = example.new Soundcard();
        sc.setUsb(Optional.of(usb));

        Computer c = example.new Computer();
        c.setSoundcard(Optional.of(sc));
        c.setSoundcard(Optional.empty());

        String name = Optional.of(c).flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUSB)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
        System.out.println(name);

    }
}
