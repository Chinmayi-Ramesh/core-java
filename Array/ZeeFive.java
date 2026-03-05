class ZeeFive {

    public static void main(String args[]) {

        String appName = "Zee5";

        String languages[] = {
            "English", "Hindi", "Telugu",
            "Tamil", "Kannada", "Malayalam"
        };

        
        String englishSerials[] = {
            "Blacklist","Suits","Friends","Breaking Bad","Better Call Saul",
            "Money Heist","Dark","Lupin","The Crown","Peaky Blinders",
            "Stranger Things","Narcos","Ozark","House of Cards","Sherlock",
            "Mindhunter","Vikings","The Witcher","Lucifer","Lost",
            "Prison Break","Dexter","The Boys","Westworld","The Flash",
            "Arrow","Supergirl","Gotham","The Walking Dead","Game of Thrones"
        };

        
        String hindiSerials[] = {
            "Kumkum Bhagya","Kundali Bhagya","Bhagya Lakshmi","Meet","Tujhse Hai Raabta",
            "Qurbaan Hua","Guddan Tumse Na Ho Paayega","Pavitra Rishta","Jhansi Ki Rani",
            "Jodha Akbar","Ek Tha Raja Ek Thi Rani","Kasamh Se","Saat Phere",
            "Yeh Teri Galiyan","Jamai Raja","Agnisakshi","Choti Bahu","Bandhan",
            "Hitler Didi","Punar Vivah","Doli Armaano Ki","Aur Pyaar Ho Gaya",
            "Rishton Ka Saudagar","Aap Ke Aa Jane Se","Kaala Teeka",
            "Zindagi Ki Mehek","Ishq Subhan Allah","Bepanah Pyaar",
            "Ghar Ek Mandir","Ek Tha Raja"
        };

        
        String teluguSerials[] = {
            "Muddha Mandaram","Radhamma Kuthuru","Gundamma Gari Manavadu","Kalyana Vaibhogam","America Ammayi",
            "Sathamanam Bhavathi","Nethra Jyothi","Iddaru Ammayilu","Koilamma","Mutyala Muggu",
            "Chakravakam","Rama Sakkani Seetha","Agni Sakshi","Mangamma Gari Manavadu","Prema Entha Madhuram",
            "Trinayani","No.1 Kodalu","Devatha","Akka Chellellu","Attarintlo Akka Chellellu",
            "Krishnaveni","Jagadhatri","Oohalu Gusagusalade","Padamati Sandhya Ragam","Sundari",
            "Subhasree","Amrutham","Rama Seetha","Bhagya Rekha","Sravana Sameeralu"
        };

        
        String tamilSerials[] = {
            "Sembaruthi","Oru Oorla Oru Rajakumari","Rettai Roja","Deivamagal","Poove Poochoodava",
            "Sathya","Yaaradi Nee Mohini","Neethane Enthan Ponvasantham","Gokulathil Seethai","Pandian Stores",
            "Baakiyalakshmi","Thirumathi Hitler","Endrendrum Punnagai","Kalyanam Mudhal Kadhal Varai","Vidhya No.1",
            "Anbe Sivam","Mouna Ragam","Raja Rani","Roja","Chithi",
            "Metti Oli","Kolangal","Magarasi","Arputham","Mani",
            "Anandham","Lakshmi","Chellame","Kaatrukkenna Veli","Nila"
        };

        
        String kannadaSerials[] = {
            "Gattimela","Jothe Jotheyali","Naagini","Yaare Nee Mohini","Paaru",
            "Kamali","Krishna Tulasi","Radha Ramana","Puttagowri Maduve","Mangalya",
            "Sathya","Nagini 2","Ashwini Nakshatra","Geetha","Gruhalakshmi",
            "Kaveri","Premaloka","Sundari","Manasa Sarovara","Mayamruga",
            "Janaki Raghava","Amruthavarshini","Hoo Bisilu","Nammane Yuvarani","Sarvamangala Mangalye",
            "Lakshmi Baramma","Gunasundari","Eradu Kanasu","Suryavamsha","Radha Kalyana"
        };

        
        String malayalamSerials[] = {
            "Kudumbavilakku","Chembarathi","Pookkalam Varavayi","Kaiyethum Doorath","Parasparam",
            "Karuthamuthu","Sathya Enna Penkutty","Azhagiya Laila","Neeyum Njanum","Vanambadi",
            "Bharya","Sthreedhanam","Nilavilakku","Aakashadoothu","Ente Manasaputhri",
            "Kalyani","Mizhi Randilum","Manjil Virinja Poovu","Kanalpoovu","Swantham Suhruthu",
            "Sreeraman Sreedevi","Amrutham","Udayam","Minnukettu","Kayamkulam Kochunni",
            "Thulabharam","Megham","Chandanamazha","Pranayam","Makalkku"
        };

        

        System.out.println("App name is " + appName);

        System.out.println("\nAvailable Languages:");
        System.out.println(
            languages[0]+"\n"+languages[1]+"\n"+languages[2]+"\n"+
            languages[3]+"\n"+languages[4]+"\n"+languages[5]
        );

        
        System.out.println("\nEnglish Serials:");
        System.out.println(
            englishSerials[0]+"\n"+englishSerials[1]+"\n"+englishSerials[2]+"\n"+englishSerials[3]+"\n"+englishSerials[4]+"\n"+
            englishSerials[5]+"\n"+englishSerials[6]+"\n"+englishSerials[7]+"\n"+englishSerials[8]+"\n"+englishSerials[9]+"\n"+
            englishSerials[10]+"\n"+englishSerials[11]+"\n"+englishSerials[12]+"\n"+englishSerials[13]+"\n"+englishSerials[14]+"\n"+
            englishSerials[15]+"\n"+englishSerials[16]+"\n"+englishSerials[17]+"\n"+englishSerials[18]+"\n"+englishSerials[19]+"\n"+
            englishSerials[20]+"\n"+englishSerials[21]+"\n"+englishSerials[22]+"\n"+englishSerials[23]+"\n"+englishSerials[24]+"\n"+
            englishSerials[25]+"\n"+englishSerials[26]+"\n"+englishSerials[27]+"\n"+englishSerials[28]+"\n"+englishSerials[29]
        );

        
        System.out.println("\nHindi Serials:");
        System.out.println(
            hindiSerials[0]+"\n"+hindiSerials[1]+"\n"+hindiSerials[2]+"\n"+hindiSerials[3]+"\n"+hindiSerials[4]+"\n"+
            hindiSerials[5]+"\n"+hindiSerials[6]+"\n"+hindiSerials[7]+"\n"+hindiSerials[8]+"\n"+hindiSerials[9]+"\n"+
            hindiSerials[10]+"\n"+hindiSerials[11]+"\n"+hindiSerials[12]+"\n"+hindiSerials[13]+"\n"+hindiSerials[14]+"\n"+
            hindiSerials[15]+"\n"+hindiSerials[16]+"\n"+hindiSerials[17]+"\n"+hindiSerials[18]+"\n"+hindiSerials[19]+"\n"+
            hindiSerials[20]+"\n"+hindiSerials[21]+"\n"+hindiSerials[22]+"\n"+hindiSerials[23]+"\n"+hindiSerials[24]+"\n"+
            hindiSerials[25]+"\n"+hindiSerials[26]+"\n"+hindiSerials[27]+"\n"+hindiSerials[28]+"\n"+hindiSerials[29]
        );

        
        System.out.println("\nTelugu Serials:");
        System.out.println(
            teluguSerials[0]+"\n"+teluguSerials[1]+"\n"+teluguSerials[2]+"\n"+teluguSerials[3]+"\n"+teluguSerials[4]+"\n"+
            teluguSerials[5]+"\n"+teluguSerials[6]+"\n"+teluguSerials[7]+"\n"+teluguSerials[8]+"\n"+teluguSerials[9]+"\n"+
            teluguSerials[10]+"\n"+teluguSerials[11]+"\n"+teluguSerials[12]+"\n"+teluguSerials[13]+"\n"+teluguSerials[14]+"\n"+
            teluguSerials[15]+"\n"+teluguSerials[16]+"\n"+teluguSerials[17]+"\n"+teluguSerials[18]+"\n"+teluguSerials[19]+"\n"+
            teluguSerials[20]+"\n"+teluguSerials[21]+"\n"+teluguSerials[22]+"\n"+teluguSerials[23]+"\n"+teluguSerials[24]+"\n"+
            teluguSerials[25]+"\n"+teluguSerials[26]+"\n"+teluguSerials[27]+"\n"+teluguSerials[28]+"\n"+teluguSerials[29]
        );

        
        System.out.println("\nTamil Serials:");
        System.out.println(
            tamilSerials[0]+"\n"+tamilSerials[1]+"\n"+tamilSerials[2]+"\n"+tamilSerials[3]+"\n"+tamilSerials[4]+"\n"+
            tamilSerials[5]+"\n"+tamilSerials[6]+"\n"+tamilSerials[7]+"\n"+tamilSerials[8]+"\n"+tamilSerials[9]+"\n"+
            tamilSerials[10]+"\n"+tamilSerials[11]+"\n"+tamilSerials[12]+"\n"+tamilSerials[13]+"\n"+tamilSerials[14]+"\n"+
            tamilSerials[15]+"\n"+tamilSerials[16]+"\n"+tamilSerials[17]+"\n"+tamilSerials[18]+"\n"+tamilSerials[19]+"\n"+
            tamilSerials[20]+"\n"+tamilSerials[21]+"\n"+tamilSerials[22]+"\n"+tamilSerials[23]+"\n"+tamilSerials[24]+"\n"+
            tamilSerials[25]+"\n"+tamilSerials[26]+"\n"+tamilSerials[27]+"\n"+tamilSerials[28]+"\n"+tamilSerials[29]
        );

        // KANNADA
        System.out.println("\nKannada Serials:");
        System.out.println(
            kannadaSerials[0]+"\n"+kannadaSerials[1]+"\n"+kannadaSerials[2]+"\n"+kannadaSerials[3]+"\n"+kannadaSerials[4]+"\n"+
            kannadaSerials[5]+"\n"+kannadaSerials[6]+"\n"+kannadaSerials[7]+"\n"+kannadaSerials[8]+"\n"+kannadaSerials[9]+"\n"+
            kannadaSerials[10]+"\n"+kannadaSerials[11]+"\n"+kannadaSerials[12]+"\n"+kannadaSerials[13]+"\n"+kannadaSerials[14]+"\n"+
            kannadaSerials[15]+"\n"+kannadaSerials[16]+"\n"+kannadaSerials[17]+"\n"+kannadaSerials[18]+"\n"+kannadaSerials[19]+"\n"+
            kannadaSerials[20]+"\n"+kannadaSerials[21]+"\n"+kannadaSerials[22]+"\n"+kannadaSerials[23]+"\n"+kannadaSerials[24]+"\n"+
            kannadaSerials[25]+"\n"+kannadaSerials[26]+"\n"+kannadaSerials[27]+"\n"+kannadaSerials[28]+"\n"+kannadaSerials[29]
        );

       
        System.out.println("\nMalayalam Serials:");
        System.out.println(
            malayalamSerials[0]+"\n"+malayalamSerials[1]+"\n"+malayalamSerials[2]+"\n"+malayalamSerials[3]+"\n"+malayalamSerials[4]+"\n"+
            malayalamSerials[5]+"\n"+malayalamSerials[6]+"\n"+malayalamSerials[7]+"\n"+malayalamSerials[8]+"\n"+malayalamSerials[9]+"\n"+
            malayalamSerials[10]+"\n"+malayalamSerials[11]+"\n"+malayalamSerials[12]+"\n"+malayalamSerials[13]+"\n"+malayalamSerials[14]+"\n"+
            malayalamSerials[15]+"\n"+malayalamSerials[16]+"\n"+malayalamSerials[17]+"\n"+malayalamSerials[18]+"\n"+malayalamSerials[19]+"\n"+
            malayalamSerials[20]+"\n"+malayalamSerials[21]+"\n"+malayalamSerials[22]+"\n"+malayalamSerials[23]+"\n"+malayalamSerials[24]+"\n"+
            malayalamSerials[25]+"\n"+malayalamSerials[26]+"\n"+malayalamSerials[27]+"\n"+malayalamSerials[28]+"\n"+malayalamSerials[29]
        );

    }
}
