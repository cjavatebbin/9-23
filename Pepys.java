public class Pepys {
    
    public double probAtLeastOneSix(int n) {

        int successes = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=6;j++)
            {
                int rand = (int) Math.random() * 6 + 1;
                if(rand == 6)
                {
                    successes++;
                    break;
                }
            }
        }
        
        return (double) successes/n;
    }

    public double probAtLeastTwoSixes(int n) {

        int successes = 0;
        for(int i=0;i<n;i++)
        {
            int num6 = 0;
            for(int j=1;j<=12;j++)
            {
                int rand = (int) Math.random() * 6 + 1;
                if(rand == 6)
                    num6++;

                if(num6==2)
                {
                    successes++;
                    break;
                }
            }
        }
        
        return (double) successes/n;

    }

}
